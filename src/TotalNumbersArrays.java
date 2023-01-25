import java.util.Arrays;

public class TotalNumbersArrays {
    public static void main(String[] args) {
        //This program gives us total of arrays numbers.
        int[] numbers  = {53,15,2,37};
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum+= numbers[i];}

        System.out.println("Total of "+ Arrays.toString(numbers) +" is equal to "+sum);
        }
    }