public class StringClass {
    public static void main(String[] args) {
        String name;
        name = "parker";
        name = name.concat(" bachcha");
        char[] charArray = {'c','b','c','d','e'};

        String s = new String(charArray);
        char[] a = {'a','b'};
        System.out.println(s.copyValueOf(a));




    }
}
