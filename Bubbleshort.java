public class Bubbleshort {
    
    
        public static int sumWithBubbleSort(int L1, int L2) {
            int[] numbers = {L1, L2};
            
        
            boolean swapped;
            do {
                swapped = false;
                if (numbers[0] > numbers[1]) {
    
                    int temp = numbers[0];
                    numbers[0] = numbers[1];
                    numbers[1] = temp;
                    swapped = true;
                }
            } while (swapped);
            
            return numbers[0] + numbers[1];
        }
        
        public static void main(String[] args) {
            int num1 = 25;
            int num2 = 10;
            
            System.out.println("Original numbers: " + num1 + " and " + num2);
            int sum = sumWithBubbleSort(num1, num2);
            System.out.println("Sum after bubble sort: " + sum);
            
            num1 = 7;
            num2 = 3;
            System.out.println("\nOriginal numbers: " + num1 + " and " + num2);
            sum = sumWithBubbleSort(num1, num2);
            System.out.println("Sum after bubble sort: " + sum);
            
            num1 = 5;
            num2 = 5;
            System.out.println("\nOriginal numbers: " + num1 + " and " + num2);
            sum = sumWithBubbleSort(num1, num2);
            System.out.println("Sum after bubble sort: " + sum);
        }
    }
