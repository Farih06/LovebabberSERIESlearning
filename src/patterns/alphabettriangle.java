package patterns;

public class alphabettriangle {
    static void main(){
        int n =5;

        for(int i=0;i<n;i++){
            for (int j=0;j<=i;j++){
                int a=j;
                int b= 'E';
                int ans =b-a;
                char finalAns =(char)ans;
                System.out.print(finalAns+" ");

            }
            System.out.println();
        }
    }
}
