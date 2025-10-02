import java.util.Scanner;

class Animal {
    void sound() {
        System.out.println("Animal makes a sound.");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks.");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal animal = new Dog(); // Upcasting
        animal.sound(); // Runtime polymorphism
    }

    public static class array21 {
        public static void main(String[] args) {
            int row,col;
            int Ar[][]=new int[10][10];
            Scanner sc = new Scanner(System.in);
            System.out.println("enter the no. of row and column");
            row=sc.nextInt();
            col=sc.nextInt();
            System.out.println("enter the array element");
            for(int i=0;i<row;i++){
                for(int j=0;j<col;j++){
                    Ar[i][j]=sc.nextInt();
                }
            }
            for(int i=0;i<row;i++){
                for(int j=0;j<col;j++){
                    System.out.print(Ar[i][j]);
                }
                System.out.println();
            }
            System.out.println("transpose of a matrix");
            for(int i=0;i<col;i++){
                for(int j=0;j<row;j++){
                    System.out.print(Ar[j][i]);
                }
                System.out.println();
            }
        }
    }

    public static class array2D {
        public static void main(String[] args) {

            int[][] ar ={{1,0,1},{1,1,1},{0,0,0},{1,0,1}};

            int max=0;
            int index=0;

           for(int i=0;i<ar.length;i++){
                int count=0;
                for(int j=0;j<ar[i].length;j++){
                    if(ar[i][j]==1){
                        count++;
                    }
                }
                max=Math.max(count,max);
                if(count>=max){
                    index=i;
                }
           }
           System.out.println(index);


        }
    }
}
