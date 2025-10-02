public class BinaryTree {
    Node root;

    public BinaryTree() {
        this.root = null;
    }

    // Method to insert a new node into the tree
    public void insert(int value) {
        Node newNode = new Node(value);

        if (root == null) {
            root = newNode;
        } 
        else {
            insertNode(root, newNode);
        }
    }

    // Helper method to recursively insert a new node into the tree
    private void insertNode(Node currentNode, Node newNode) {
        if (newNode.value < currentNode.value) {
            if (currentNode.left == null) {
                currentNode.left = newNode;
            } else {
                insertNode(currentNode.left, newNode);
            }
        } else if (newNode.value > currentNode.value) {
            if (currentNode.right == null) {
                currentNode.right = newNode;
            } else {
                insertNode(currentNode.right, newNode);
            }
        }
    }

    // Method to print the tree in inorder traversal
    public void printInorder() {
        printInorder(root);
    }

    // Helper method to recursively print the tree in inorder traversal
    private void printInorder(Node node) {
        if (node != null) {
            printInorder(node.left);
            System.out.print(node.value + " ");
            printInorder(node.right);
        }
    }
}