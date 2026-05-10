package patterns;

public class numericalpyramid {
    static void main(){
        int n=4;
        for(int i=1;i<=n;i++){
            //part 1
            for(int j=1;j<=(n-i);j++){
                System.out.print("  ");
            }
            //part 2
            for(int j=1;j<=i;j++){
               System.out.print(j+" ") ;
            }
            //part 3
            int rowval=i;
            int decrowval=i-1;
            for(int j=1;j<=i-1;j++){
                System.out.print(decrowval +" ");
                decrowval--;
            }
            System.out.println();
    }
}}
