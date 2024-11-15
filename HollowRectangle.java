import java.util.Scanner;
public class HollowRectangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Number:");
        int a =sc.nextInt();
        System.out.print("Enter Another Number:");
        int b =sc.nextInt();
        for(int i=1; i<=a; i++)
        {
            for(int j=1; j<=b; j++)
            {
                if(i==1||j==1 || i==a|| j==b ){
                    System.out.print( "*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

           sc.close();
    }
}
