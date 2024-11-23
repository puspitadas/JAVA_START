public class MethodsExample {

    //Problem: Print fibonacci
    static int fibonacci(int n){
        if(n<=1){
            return n;
        }
        return fibonacci(n-1)+fibonacci(n-2);

    }

    //Problem: Print * pattern
    static void pattern(int n) {
        for(int i=1; i<=n;i++){
            for(int j=1; j<=i;j++){
                System.out.print("*\t");
            }
            System.out.println(" ");
        }
    }

    //Problem 9: Convert celcius to farhenheit [ ((0°C × 9/5) + 32 = 32°F ]
    static double conversion(double celcius){
        double farhenheit = celcius * 9/5 + 32;
        System.out.println(celcius+"*C is equal to"+farhenheit+"*F");
        return farhenheit;
    }
    public static void main(String[] args) {
        // Recursive function to sum 1st n natural numbers

        //Fibonacci series
        int f = fibonacci(10);
        System.out.println(f);

        pattern(3);

        conversion(34);


    }


}
