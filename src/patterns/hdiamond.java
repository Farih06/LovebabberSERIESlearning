package patterns;

public class hdiamond {
    static void main() {
        int n = 4;

        for (int i = 1; i<= n; i++) {
            //part 1
            for (int j =1;j<=i;j++ ){
                System.out.print("* ");
            }

            //part 2
            for(int j=1;j<=(2*(n-i));j++){
                System.out.print("  ");
            }
            //part 3
            for (int j =1;j<=i;j++ ){
                System.out.print("* ");
            }
            System.out.println();
        }
        //part 4
        for(int i=1;i<=n;i++){
            for(int j=n;j<=1;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
