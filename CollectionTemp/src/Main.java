import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        //Generic classes
        //ArrayList default array size : 10
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
    }
}