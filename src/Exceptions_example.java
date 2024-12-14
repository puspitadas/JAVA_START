import java.util.Scanner;

//Problem 4: Throw a Custom Exception if max retries are reached
//Problem 5: Wrap inside a method which throws a custom exception
class ExceptionRetry extends Exception{
    @Override
    public String toString() {
        return "Max Retries Exceeded"+getMessage();
    }

    @Override
    public String getMessage() {
        return "You have exceeded the maximum limit 5";
    }
}

public class Exceptions_example {
    public static void main(String[] args){

        //Problem 1: Demonstrate syntax, logical and runtime errors
//        int a = 7   -> Syntax error (no semicolon)
//        int age =78;
//        int year_born = 2000-78; --> Logical error
//        System.out.println(2000/0); --> Throws exception (Arithmetic)


        //Problem 2: Print "Haha" during Arithmetic exception and "Hehe" during an Illegal argument exception

        try{
            int a = 666/0;
        }
        catch (ArithmeticException e){
            System.out.println("Haha");
        }
        catch (IllegalArgumentException e){
            System.out.println("Hehe");
        }

        //Problem 3: Program that allows to keep accessing an array until a valid index is given. If max retries exceed 5, print "Error".
        boolean flag = true;
        int [] marks = new int[3];
        marks[0] = 3;
        marks[1] = 2;
        marks[2] = 5;

        Scanner sc = new Scanner(System.in);

        int index;
        int i =0;
        while(flag && i<5){
            try{
                System.out.println("Enter the value of index:");
                index = sc.nextInt();
                System.out.println("The value of marks[imdex] is:"+marks[index]);
                break;
            }
            catch (Exception e){
                System.out.println("Index invalid!");
                i++;
            }

        }
        if(i>=5){
            try{
                throw new ExceptionRetry();
            }
            catch (Exception e) {
                System.out.println("Error!!!"+e.getMessage());
            }
        }

    }

}
