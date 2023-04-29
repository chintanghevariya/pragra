public class ForEach {
    public static void main(String[] args) {
        // initialization of for loop
        int[] prices = new int[10];

        // with for loop
        for(int i = 0; i < prices.length; i++){
            int temp = i * 10;
            prices[i] = temp ;
            System.out.println(prices[i]);
        }

        // with for-each loop / Advance for loop
        for(int temp : prices){
            System.out.println(temp);
        }
    }
}
