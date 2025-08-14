
// public class InvertedPyramid {
//     public static void main(String[] args) {
//         int rows = 5; // Number of rows in the pyramid
        
//         // Outer loop for rows
//         for (int i = rows; i >= 1; i--) {
//             // Inner loop for spaces
//             for (int j = 1; j <= rows - i; j++) {
//                 System.out.print(" ");
//             }
            
//             // Inner loop for stars
//             for (int k = 1; k <= 2 * i - 1; k++) {
//                 System.out.print("*");
//             }
            
//             // Move to the next line
//             System.out.println();
//         }
//     }
// }
// ====================================================================
public class InvertedPyramid{
    public static void main(String[] args) {
        int rows =5;// You can change this value for different sizes
        
        // Print ascending pattern
        for (int i =1;i <= rows; i++) {
            for (int j =1;j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        
        // Print descending pattern
        for (int i = rows - 5;i >=5; i--) {
            for (int j =5; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
// ======================================================





