package patterns;

public class rohmbuspattern {
    static void main(){
        int n =5;

        for(int i=1;i<=n;i++){
            //part 1
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int k=0;k<=n;k++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
