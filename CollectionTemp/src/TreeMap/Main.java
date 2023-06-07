package TreeMap;

import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        //TreeSet -> ordered set
        // red and black binary tree.
        // log(N)
        // order based on the natural sorting algo.
        TreeMap<Student, String> attend = new TreeMap<>();

        attend.put(Student.builder().name("tim").school("gbc").age(12).build(),"P");
        attend.put(Student.builder().name("ken").school("gbc").age(14).build(),"A");
        attend.put(Student.builder().name("zen").school("gbc").age(16).build(),"P");
        attend.put(Student.builder().name("ani").school("gbc").age(1).build(),"A");

        System.out.println(attend);

//        Student s1 = new Student("ss","ff",12);
//        Student s2 = new Student("ss","ff",14);
//        s1.compareTo(s2);


        //Exception in thread "main" java.lang.ClassCastException: class
        // TreeMap.Student cannot be cast to class java.lang.Comparable
        // (TreeMap.Student is in unnamed module of loader 'app';
        // java.lang.Comparable is in module java.base of loader 'bootstrap')
        //	at java.base/java.util.TreeMap.compare(TreeMap
//        creds.put("zan","234");
//        creds.put("tan","134");
//        creds.put("ant","123");
//        creds.put("ken","412");
//
//        System.out.println(creds);


    }
}
