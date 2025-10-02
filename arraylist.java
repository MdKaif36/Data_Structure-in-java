import java.util.ArrayList;
public class arraylist {
    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>();
        list.add(45);
        list.add(89);
        list.add(43);
        list.add(87);
        list.add(91);
        list.add(32);
        System.out.println(list);
        System.out.println(list.contains(89));
        System.out.println(list.remove(4));
        System.out.println(list);
        System.out.println(list.equals(43));
        System.out.println(list.get(3));
        System.out.println(list.set(02, 23));
        System.out.println(list);
    }
    
}
