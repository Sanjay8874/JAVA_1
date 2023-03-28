import java.util.*;
public class Method{

public static void PrintName(String name){
    System.out.println(name);
    return;
        }

 public static void main(String args[]){
    System.out.println("Enter name");
    Scanner N1 = new Scanner(System.in);

    String name = N1.next();
    PrintName(name);



        }
}
