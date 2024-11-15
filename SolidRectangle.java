import java.util.Scanner;
public class SolidRectangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number:");
        int a=sc.nextInt();
        System.out.print("Enter another number:");
        int b=sc.nextInt();
        for(int i=1; i<=a; i++)
        {
            for(int j=1; j<=b; j++)
            {
                System.out.print(" * ");
            }
            System.out.println();
        }
        sc.close();
    }
}
