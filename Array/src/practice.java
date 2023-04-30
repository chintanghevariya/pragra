// program to reverse the string.

public class practice {
    public static void main(String[] args) {
        String s1 = "This string needs to be reverse";
        char[] charArray = s1.toCharArray();
        System.out.println("The original string:");
        System.out.println(s1);
        System.out.println("Reverse string :");
        for(int i = charArray.length-1; i >= 0; i--){
            System.out.print(charArray[i]);
        }
    }
}
