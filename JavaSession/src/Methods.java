public class Methods {
    public static void main(String[] args) {
        System.out.println(Sum(10,10));
    }
    static String Sum(int a, int b){
        int total = a + b;
        String answer= "";
        if((total%2) == 0){
             answer = "No. is even";
        }else{
            answer = "No. is odd";
        }
        return answer;
    }
}
