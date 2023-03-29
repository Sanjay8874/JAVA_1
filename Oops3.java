class Car{
    String color;
    String name;

}

class Maruti1 extends Car{
void dis(){
    System.out.println("carr");
}
}

public class Oops3 {
    public static void main(String[] args){
        Maruti1 m1 = new Maruti1();
        m1.color="black";
        m1.name="suzuki";
        m1.dis();
    }
}