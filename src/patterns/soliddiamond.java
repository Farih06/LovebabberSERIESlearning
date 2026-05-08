package patterns;

public class soliddiamond {
    public static void main(String[] args) {
        int n = 4;

        // Top half
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {      // ✅ n-i spaces
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {  // stars grow
                System.out.print("*");
            }
            System.out.println();
        }

        // Bottom half
        for (int i = 1; i <= n - 1; i++) {
            for (int j = 1; j <= i; j++) {           // ✅ i spaces
                System.out.print(" ");
            }
            for (int k = 1; k <= 2*(n-i) - 1; k++) { // stars shrink
                System.out.print("*");
            }
            System.out.println();
        }
    }
}