class Student{
    String name;
    int id;
    String addr;


    public void PrintDetalil(){
        System.out.println("Name is: "+ name +"id is :" +id +"address is: "+addr);
    }
    }
 //main class

public class Oops1{
    public static void main(String[] args){
        Student s1 = new Student();
        s1.name= "Sanjay yadav";
        s1.id=12686;
        s1.addr="Jaunpur";
        s1.PrintDetalil();
    }
}

