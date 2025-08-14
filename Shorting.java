import java.util.Arrays;
public class Shorting {
    
    public static int sumWithSorting(int L1, int L2) {
        
        int[] numbers = {L1, L2};
        
        Arrays.sort(numbers);
        return numbers[0] + numbers[1];
    }
    
    public static void main(String[] args) {
        int num1 = 15;
        int num2 = 7;
        
        System.out.println("Original numbers: " + num1 + " and " + num2);
        int sum = sumWithSorting(num1, num2);
        System.out.println("Sum after sorting: " + sum);
        
        num1 = 3;
        num2 = 20;
        System.out.println("\nOriginal numbers: " + num1 + " and " + num2);
        sum = sumWithSorting(num1, num2);
        System.out.println("Sum after sorting: " + sum);
    }

}   
