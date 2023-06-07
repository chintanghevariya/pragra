import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
      //  Employee e = new Employee();

        //Generic classes
        //ArrayList default array size : 10
        //Accessing data
        ArrayList<String> names = new ArrayList<>();


        //Time Complexity
        // -> BigO(1), logn, n, nlogn, n2-----
        names.add("chintan");
        names.add("pappu");
        names.add("mary");
        names.add("peter");

        ArrayList<String> specialNames = new ArrayList<>();
        specialNames.add("fd");
        specialNames.add("fd");
        specialNames.add("fd");
        specialNames.add("fd");
        specialNames.add(null);
        specialNames.addAll(0,names);
        System.out.println(names);
        System.out.println(specialNames);

        Iterator<String> iterator = names.iterator();
        while (iterator.hasNext()){
            if(iterator.next().length() != 4 ){
                iterator.remove();
            }
        }
        System.out.println(names);

        //LinkedList -> Modification

        List<String> name = new LinkedList<>();
        name.add("chintan");
        name.add("patel");
        ((LinkedList<String>)name).add(2,"nish");
        ((LinkedList<String>)name).addFirst("nishudi");
    }
}