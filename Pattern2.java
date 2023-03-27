// pattern for hollow rectangle
import java.util.*;

public class Pattern2 {
    public static void main(String[] args){
     Scanner N1 = new Scanner(System.in);

     System.out.print("Enter row");
     int n = N1.nextInt();
     System.out.println("Enter colomn");
     int m = N1.nextInt();

     for(int i = 1;i<=n; i++)
     {
         for(int j=1;j<=m;j++)
         {
             if(i==1||j==1||i==n||j==m){

                 System.out.print("*");

             }else
             {
                 System.out.print(" ");
             }

         }
         System.out.println();
     }

    }
}