
public class Calculate {
    private int sum = 0;
    private double average = 0;
    private int count = 0;

    public double average(int[] prices){

        for(int i = 0; i < prices.length; i++){
            sum = sum + prices[i];
            count++;
        }
        return average = (double) sum/count;
    }
}
