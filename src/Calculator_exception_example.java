import java.util.Scanner;
/*This program is completely done by Puspita
* */
public class Calculator_exception_example {
    public static void main(String[] args) throws Exception {
        /*
        Create a custom calculator with following operation:
        1. + -> Addition
        2. - -> Subtraction
        3. * -> Multiplication
        4. / -> Division
        which throws the following exceptions:
        1. Invalid input exception ex: 8 & 9
        2. Cannot divide by 0 exception
        3. Max input exception if any of the inputs is greater than 100000
        4. Max Multiplier Reached Exception - Don't allow any multiplication input to be greater than 7000
        */


        Calculator_exception_example  calc= new Calculator_exception_example();
        calc.performCalculations();

    }
    public void performCalculations() throws Exception {
        Scanner s  = new Scanner(System.in);
        System.out.println("please enter value1");
        validateIntegerInput(s);
        int val1 = s.nextInt();
        validateMaxInput(val1);
        System.out.println("please enter value2");
        validateIntegerInput(s);
        int val2 = s.nextInt();
        validateMaxInput(val2);
        System.out.println("the sum of "+val1+ " and "+val2+" is :"+add(val1,val2));
        System.out.println("the sub of "+val1+ " and "+val2+" is :"+sub(val1,val2));
        System.out.println("the multiplication of "+val1+ " and "+val2+" is :"+mul(val1,val2));
        System.out.println("the division of "+val1+ " and "+val2+" is :"+div(val1,val2));
    }

    private static void validateIntegerInput(Scanner s) throws InvalidInputException {
        if(!s.hasNextInt()){
            throw new InvalidInputException("Invalid input provided please provide integer only");
        }
    }

    public int add(int val1, int val2) {
        return val1 + val2;
    }
    public int sub(int val1, int val2) {
        return val1 - val2;
    }
    public int mul(int val1, int val2) throws Exception {
        multiplicationValidator(val1);
        multiplicationValidator(val2);
        return val1 * val2;
    }
    public int div(int val1, int val2) throws Exception {
        divideValidator(val2);
        return val1 / val2;
    }

    public void validateMaxInput(Integer val) throws Exception{
         if(val > 100000){
            throw new MaxInputException("given input is exceeding 100000");
        }
    }
    public void multiplicationValidator(Integer val) throws Exception{
        if(val > 7000){
            throw new MaxMultiplierReachedException("given multi input is exceeding 7000");
        }
    }
    public void divideValidator(Integer val) throws Exception{
        if(val == 0){
            throw new CannotDivideByZeroException("cannot perform division with denominator as 0");
        }
    }


}
 class InvalidInputException extends Exception{
    InvalidInputException(String message){
        super(message);
    }

}
class CannotDivideByZeroException extends Exception{
    CannotDivideByZeroException(String message){
        super(message);
    }

}
class MaxInputException extends Exception{
    MaxInputException(String message){
        super(message);
    }

}
class MaxMultiplierReachedException extends Exception{
    MaxMultiplierReachedException(String message){
        super(message);
    }

}



