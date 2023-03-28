import java.util.*;
public class Method{
// function to print Name which entered from user.
/*public static void PrintName(String name){
    System.out.println(name);
    return;
        }*/

// Function for Sum of 2 number

public static int Sum(int a,  int b)
{
    int sum = a+b;
    return sum;
}

//main function
 public static void main(String args[]){

    Scanner N1 = new Scanner(System.in);
    System.out.println("Enter 1st Number");
    int a = N1.nextInt();
    System.out.println("Enter 2nd  Number");
    int b = N1.nextInt();
    int sum = Sum(a,b);
    System.out.println("Sum of 2 number : " +sum);

        }
}
