package CollectionFramework;
import java.util.*;
public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> students=new ArrayList<>();
        students.add("Neeraj");
        students.add("Vikas");
        System.out.println(students);
        students.add(2,"akash");
        System.out.println(students);
        students.set(2,"shubham");
        System.out.println(students);
        students.remove("shubham");
        System.out.println(students);
        System.out.println(students.contains("Vikas"));
        for(String name:students){
            System.out.println(name);

        }

    }
}
