package patterns;

public class pyramid {
    static void main(){

        int n=5;

        for(int i =1;i<=n;i++){
            for (int j=1;j<=n-i;j++) {
                System.out.print(" ");
            }
            int a = (2*i-1);
            for (int k=0;k<a;k++){
                System.out.print("*");
            }
            System.out.println();

        }


    }
}
