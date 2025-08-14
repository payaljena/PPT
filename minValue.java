// import java.util.Stack;

// public class MinValueInArrayWithStack {
//     public static void main(String[] args) {
//         int[] arr = {1, 0, 1, 0, 1, 0, 0, 1}; // Example array with 0s and 1s
        
//         int minValue = findMinWithStack(arr);
//         System.out.println("Minimum value in the array: " + minValue);
//     }
    
//     public static int findMinWithStack(int[] arr) {
//         if (arr == null || arr.length == 0) {
//             throw new IllegalArgumentException("Array must not be empty or null");
//         }
        
//         Stack<Integer> stack = new Stack<>();
        
//         // Push first element to stack
//         stack.push(arr[0]);
        
//         // Iterate through the array
//         for (int i = 1; i < arr.length; i++) {
//             // Since we only have 0s and 1s, the minimum can only be 0 or 1
//             if (arr[i] < stack.peek()) {
//                 stack.pop();
//                 stack.push(arr[i]);
//             }
//             // If current element is equal to current min, we can push it too
//             // to maintain count if needed (though not necessary for just finding min)
//             else if (arr[i] == stack.peek()) {
//                 stack.push(arr[i]);
//             }
//         }
        
//         // The minimum will be at the bottom of the stack
//         // But with our approach, it's actually the element remaining in stack
//         return stack.peek();
//     }
    
//     // Alternative optimized version for 0s and 1s
//     public static int findMinOptimized(int[] arr) {
//         // Since the array only contains 0s and 1s,
//         // the minimum is 0 if at least one 0 exists, otherwise 1
//         for (int num : arr) {
//             if (num == 0) {
//                 return 0;
//             }
//         }
//         return 1;
//     }
// }
// ============================================================================================
public class minValue{
    stack<Integer> = minStack;
    stack<Integer> = minStack;
    private stack<Integer> minStack;
    public void minValuealue() {
        minStack = new Stack<>();
        minStack = new Stack<>();
    }
    public void push(int value) {
        minStack.push(value);
        if (minStack.isEmpty() || value <= minStack.peek()> value) {
            minStack.push(value);
        }
    }
    public int minPeek() {
       
        return minStack.peek();
    }

    private static class stack<T> {

        public stack() {
        }
    }
}