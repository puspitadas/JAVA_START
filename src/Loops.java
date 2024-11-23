import java.util.Scanner;
public class Loops {
    public static void main(String[] args) {
        // Print Odd numbers

        int n = 10;
        for(int i=1; i<n; i++){
            System.out.println(2*i+1);
        }

        //Problem 1: Print * in decreasing pattern
        int i,j;
        for(i=5;i>0;i--){
            for(j=1;j<i;j++){
                System.out.print("*\t");
            }
            System.out.println( );

        }

       // Print * in increasing pattern
        int k, l;
        for(k=1;k<5;k++){
            for(l=1;l<=k;l++){
                System.out.print("*\t");
            }
            System.out.println( );
        }

        //Problem 2: Sum first n even numbers using while loop

        Scanner sc2 = new Scanner(System.in);
        System.out.println("Enter the count of even numbers to sum:");
        int a = sc2.nextInt();
        int count = 1;
        int sum=0, even=2;
        while(count<=a){
            sum+=even;
            count ++;

        }
        System.out.println("Sum of first " +a+ " even numbers is:"+sum);



        //Problem 3: Multiple table of a given number n

        System.out.println("Enter the multiplication table of number:");
        Scanner sc3 = new Scanner(System.in);
        int number = sc3.nextInt();
        System.out.println("Table of "+number+":");
        for (int b=1; b<=10; b++){
            int multiply = number*b;
            System.out.println(number+"X"+b+"="+multiply);
        }

        //Problem 4: Multiplication table of 10 in reverse order
        System.out.println("Multiplication of 10 in reverse:");
        for (int b=10; b>=1; b--){
            int multiply = 10*b;
            System.out.println(10+"X"+b+"="+multiply);
        }

        //Problem 5: Factorial of a given number using for loop

        System.out.println("Enter the factorial of:");
        Scanner sc5 = new Scanner(System.in);
        int input = sc5.nextInt();
        long fact = 1;
        for(int c=1;c<=input;c++){
            fact *= c;
        }
        System.out.print(fact);

        //Problem 6: Repeat 5 using while loop

        //while()
    }





}

