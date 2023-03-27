import java.util.*;

public class Practice {

    public static void main(String[] args){

        Scanner In1 = new Scanner(System.in);
        System.out.println("Enter the first value");
        int a = In1.nextInt();

        System.out.println("Enter the Second value");
        int b = In1.nextInt();

        int sum = a+b;

        System.out.println("Sum of two number is " + sum);

        System.out.println(a++ + ++a);
        System.out.println("Now a values is " +a);

        System.out.println("the values is" + +(a-- + --a));
    }
}
