package patterns;

public class alphapyramid {
    static void main(){
        int n =4;
        char a ='A';

        for(int i=0;i<=n;i++){
            //part 1 spaces
            for(int j=0;j<=n-i;j++){
                System.out.print("  ");

            }
            //Part 2 alphabets

            for(int j=0;j<i;j++){
                int b=j;
                int c= a+b;
                char finalAns= (char)c;
                System.out.print(finalAns+" ");
            }
            //part 3 alphabet
            char toprint =(char)(i+'A'-2);
            for(int j=0;j<i-1;j++){

                System.out.print(toprint+ " ");
                toprint--;
            }
            System.out.println();

        }
    }
}
