package patterns;

public class solidsquarepattern {
    static void main() {
        int n = 4;
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= n; j++) {
                System.out.print("* ");
            }
            //move to next line or row
            System.out.println();
        }
    }
}
