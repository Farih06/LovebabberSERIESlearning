package patterns;

public class invertedtraingle {
    static void main(){
        int n=4;
        for (int i =1;i<=n;i++){
            for (int j=0;j<=i-1;j++){
                System.out.print(" ");
            }
          int s= 2*(n-i)+1;
            for(int k=0;k<s ;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
