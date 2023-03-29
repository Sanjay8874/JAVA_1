class Student{
    String name;
    int age;

    Student(String n, int a){
        name =n;
        age=a;

    }
    void dis(){
        System.out.println(name+" "+age);
    }

}

public class Oops2 {
    public static void main(String[] args){
        Student s1 = new Student("Sanjay",24);
        s1.dis();

    }
}