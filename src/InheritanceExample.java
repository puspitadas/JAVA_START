

//Chapter 10 : Inheritance

//Problem 1: circle and cylinder using inheritance, constructors, super keyword and methods area & volume
class Circle{

    public int radius;

//    Circle(){    //--> Default constructor is used when super keyword is not used
//        System.out.println("I am circle non-parameterized constructor");
//    }

    Circle(int r){
        System.out.println("I am circle parameterized constructor");
        this.radius = r;
    }

    public double area(){
        return Math.PI * radius * radius;
    }
}

class Cylinder1 extends Circle{

    public int height;

    Cylinder1(int r, int h){
        super(r);
        this.height = h;
        System.out.println("I am cylinder1 parameterized constructor");
    }


    public double volume(){
        return Math.PI * radius * radius * height;
    }
}

//Problem 2: Rectangle and Cuboid using inheritance, constructors, getters and setters, methods

class Rectangle1{

    public int length;
    public int breadth;

//    Rectangle1() {
//        System.out.println("I am rectangle non-parameterized constructor");
//    }

    Rectangle1(int l, int b) {
        System.out.println("I am rectangle parameterized constructor");
        this.length = l;
        this.breadth = b;
    }

    public double area1(){
        return length * breadth;
    }
}

class Cuboid extends Rectangle1{
    public int height1;
    Cuboid(int l, int b, int h){
        super(l,b);
        this.height1=h;
        System.out.println("I am cuboid class parameterized constructor");
    }


    public int volume1(){
        return length * breadth * height1;
    }
}

public class InheritanceExample {
    public static void main(String[] args) {
        //Problem 1:
        //Circle circle = new Circle(4);
        Cylinder1 cylinder1 = new Cylinder1(6,5);
        //System.out.println("The area of circle is:"+cylinder1.area());
        //System.out.println("The volume of Cylinder is:"+cylinder1.volume());

        //Problem 2:
        Rectangle1 rectangle1 = new Rectangle1(4,3);
    }
}
