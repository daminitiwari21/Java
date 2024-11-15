// public class Christmas {
//     public static void main(String[] args) {
//         int star, space;
//         space=0;
//         for(int i=1; i<=4*3; i++)
//         {
//             for (int j=1; j<=; j++)
//             {

//             }
//         }
//     }
    
// }

public class Christmas {

    public static void main(String[] args) {
        
    int space,height=10;
    space=height-3;
    for (int i = 1; i <= height; i++) 
    {
        for (int j = 1; j <= height-4; j++) 
        {
            if (space>=j) 
               System.out.print(" ");
            else
                System.out.print("* ");
        }
        System.out.println();
        if (i%4==0)
            space++;
        else
            space--;
}
}
}

