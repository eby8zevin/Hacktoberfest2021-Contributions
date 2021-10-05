package Java;

interface Shape_intf{
    default void Shape(){
        System.out.println("\nDefault Shape Method in Shape Interface");
    }
}
interface Circle_intf{
    default void Area(){
        System.out.println("\nDefault Area Method in Circle Interface");
    }
}
interface Rectangle_intf{
    default void Area(){
        System.out.println("\nDefault Area Method in Rectangle Interface");
    }
}
interface Sign_intf{
    void sign(String S,String C);
}
class Rectangle implements Shape_intf,Rectangle_intf {
    String color;
    int length,breadth;
    Rectangle() {
        length = 10; breadth = 5;
        color = "Red";
    }
    public void Shape(){
        Shape_intf.super.Shape();
        System.out.println("Shape : Rectangle "+ "\tColor : "+color + " \t\tLength : " + length + " \tBreadth : " + breadth);
    }
    public void Area(){
        Rectangle_intf.super.Area();
        System.out.println("Area : " + (length*breadth));
    }
}
class Circle implements Shape_intf,Circle_intf {
    String color;
    int radius;
    Circle() {
        radius = 5;
        color = "White";
    }
    public void Shape() {
        Shape_intf.super.Shape();
        System.out.println("Shape : Circle " + "\tColor : " + color + " \tRadius : " + radius);
    }
    public void Area(){
        Circle_intf.super.Area();
        System.out.println("Area : " + (3.14*radius*radius));
    }
}
class Sign implements Sign_intf {
    String Color = "Black";
    String Text = "Hello!";
    public void sign(){
        System.out.println("\nSign Text : "+ Text + " \tColor : " + Color);
    }
    public void sign(String Text,String Color){
        System.out.println("\nSign Text : "+ Text + " \tColor : " + Color);
    }
}

public class Main {

    public static void main(String[] args) {
        Circle C1 = new Circle();
        C1.Shape();
        C1.Area();
        Rectangle R1 = new Rectangle();
        R1.Shape();
        R1.Area();
        Sign S = new Sign();
        S.sign();
        S.sign("Hey!","Blue");
        System.out.print("\nPresented by Yash Patel-D21DCS154");
    }
}
