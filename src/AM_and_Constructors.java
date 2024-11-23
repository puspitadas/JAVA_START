//Chapter 9 : Access Modifiers, Constructors, Getters and Setters, Method Overloading


//Problem 1: Radius and height of a cylinder
class Cylinder{
    private int radius;
    private int height;

//    Problem 3: Using Constructor
//    public Cylinder(int radius, int height) {
//        this.radius = radius;
//        this.height = height;
//    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    //Problem 2: Surface area and volume of a cylinder
    public double surfaceArea(){
        return 2 * Math.PI * radius * height + 2 * Math.PI * radius * radius;
    }

    public double volume(){
        return Math.PI * radius * radius * height;
    }

}

//Problem 4: Overload a constructor to initialize a rectangle for Length = 4 & Breadth = 5 for using custom parameters
class Rectangle{
    private int length;
    private int breadth;

    public Rectangle() {
        this.length = 4;
        this.breadth = 5;
    }

    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public int getLength() {
        return length;
    }

    public int getBreadth() {
        return breadth;
    }
}

public class AM_and_Constructors {
    public static void main(String[] args) {

        //Problem 1:
        //Cylinder myCylinder = new Cylinder(9,12); using constructor (Problem 3)
        Cylinder myCylinder = new Cylinder();
        myCylinder.setHeight(12);
        System.out.println("The height of the cylinder is : " +myCylinder.getHeight());
      //  myCylinder.setRadius(9);
        System.out.println("The radius of the cylinder is : " +myCylinder.getRadius());

        //Problem 2:
        System.out.println("Surface area of the cylinder is:"+myCylinder.surfaceArea());
        System.out.println("Volume of the cylinder is:"+myCylinder.volume());

        //Problem 4:
        Rectangle r = new Rectangle();
        System.out.println("Length of the rectangle:"+r.getLength());
        System.out.println("Breadth of the rectangle:"+r.getBreadth());

    }
}
