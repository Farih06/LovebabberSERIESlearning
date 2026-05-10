package patterns;

public class numericalpyramid2 {
    static void main() {
        int n = 4;

        for (int i = 1; i <= n; i++) {
            //part 1 spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }
            //part 2 numbers
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");

            }
            //part 3 again nums
            for(int j = 1; j <= i - 1; j++) {
              System.out.print(i+"  ");
            }
            System.out.println();
        }
    }
}
