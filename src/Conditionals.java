import java.util.Scanner;
public class Conditionals {
    public static void main(String[] args) {

        // Problem 2 : Display pass if the student has an aggregate of 40% in total and 33% in all subjects and fail if not
        System.out.println("Enter total marks:");
        Scanner sc = new Scanner(System.in);
        int total = sc.nextInt();
        System.out.println("Entered total: "+total);
        System.out.println("Maths:");
        int maths = sc.nextInt();
        System.out.println("Maths: "+maths);
        System.out.println("Science:");
        int science = sc.nextInt();
        System.out.println("Science :"+science);
        System.out.println("English:");
        int english = sc.nextInt();
        System.out.println("English :"+english);
        int score = maths + science + english;
        int secured_percent = (score * 100) / total;
        System.out.println("Percentage :"+secured_percent);

        if (secured_percent>=40 && maths >=33 && science >=33 && english >=33){
            System.out.println("Pass");
        }
        else{
            System.out.println("Fail");
        }

        // Problem 3 : Tax deduction by 5%, 20% and 30% for employees earning between 2.5 to 5.0, 5.0 to 10.0 and 10.0 to above respectively
        System.out.println("Enter your yearly income (in LPA):");
        Scanner sc1 = new Scanner(System.in);
        float income = sc1.nextFloat();

        if (income >= 2.5 && income < 5.0 ){
            float tax1 = (float) (income-income*0.05);
            System.out.println("Your new income after tax deduction of 5% is:"+tax1);
        }
        else if (income >= 5.0 && income < 10.0 ){
            float tax2 = (float) (income-income*0.20);
            System.out.println("Your new income after tax deduction of 20% is:"+tax2);
        }
        else if (income>=10.0){
            float tax3 = (float) (income-income*0.30);
            System.out.println("Your new income after tax deduction of 30% is:"+tax3);
        }
        else
        {
            System.out.println("You don't need to pay tax");
        }


        //Problem 4 : Day of the week using Switch case
        System.out.println("Enter the number of day in a week");
        Scanner sc4 = new Scanner(System.in);
        int day = sc4.nextInt();
        switch (day){
            case 1: System.out.println("Sunday");
                break;
            case 2: System.out.println("Monday");
                break;
            case 3: System.out.println("Tuesday");
                break;
            case 4: System.out.println("Wednesday");
                break;
            case 5: System.out.println("Thurday");
                break;
            case 6: System.out.println("Friday");
                break;
            case 7: System.out.println("Saturday");
                break;
            default:
                System.out.println("Sorry! There are only 7 days in a week. Type between 1-7");


        }

        //Problem :5
        System.out.println("Enter the year:");
        Scanner sc5 = new Scanner(System.in);
        int year = sc5.nextInt();
        int leap_year = year%4;
        if(leap_year==0){
            System.out.println("It is a leap year!");
        }
        else{
            System.out.println("It is not a leap year!");
        }



        //Problem 6 : Website url
        System.out.println("Enter the website url:");
        Scanner sc6= new Scanner(System.in);
        String url = sc6.nextLine();
        if(url.endsWith(".com")){
            System.out.println("It's a Commercial Website");

        }
        else if(url.endsWith(".org")){
            System.out.println("It's a Organisation Website");

        }
        else if(url.endsWith(".in")){
            System.out.println("It's an Indian Website");
        }
        else{
            System.out.println("It's an invalid website url");
        }

    }
}
