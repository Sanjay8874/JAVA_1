//Method overload practice
//adding number

class Addtion{
    void add(int a, int b){
        System.out.println((a+b));
    }
    void add(int a, int b, int c){
        System.out.println(a+b+c);
    }
}

public class Oops4 {
    public static void main(String[] args){
        Addtion A1 = new Addtion();
        A1.add(2,3);
        A1.add(2,4,5);
    }
}