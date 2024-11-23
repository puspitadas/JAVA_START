
    //Problem 1:
    class Employee{

        int salary;
        String name;
        public int getSalary(){

            return salary;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    //Problem 2:
    class CellPhone{
        public void ring(){
            System.out.println("Ringing...");
        }
        public void vibrate(){
            System.out.println("Vibrating...");
        }
        public void callFriend(){
            System.out.println("Calling Mukul...");
        }
    }

    //Problem 3:
    class Square{
        int side;
        public int area(){
            return side*side;
        }
        public int perimeter(){
            return 4*side;
        }
    }

    public class OopsExample {

    public static void main(String[] args) {
        //create a class employee with salary (property)(int), getSalary(method returning int), name (property)(string),
        //getName(method returning String), setName method changing name
        //Problem 1
        Employee puspita = new Employee();
        puspita.setName("Rajesh");
        puspita.salary = 233;
        System.out.println(puspita.getName());
        System.out.println(puspita.getSalary());

        //Problem 2
        CellPhone asus = new CellPhone();
        asus.callFriend();
        asus.vibrate();
        asus.ring();

        //Problem 3
        Square sq = new Square();
        sq.side = 3;
        System.out.println(sq.area());
        System.out.println(sq.perimeter());

    }
}
