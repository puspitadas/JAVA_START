public class StringMethods {
    public static void main(String[] args) {
        //Practice Set 3
        //Problem 1
        String name1 = "Puspita";
        System.out.println(name1.toLowerCase());

        //Problem 2
        String name2 = "    Ishita   ";
        System.out.println(name2.replace(' ' ,'_'));

        // Problem 3
        String letter = "Dear <|name|>, Thanks a lot";
        /* System.out.printf("Dear %s, Thanks a lot", letter); */
        letter = letter.replace("<|name|>","Rajesh");
        System.out.println(letter);

        // Problem 4
        String myString = "This string contains  double and triple spaces";
        System.out.println(myString.indexOf("  "));
        System.out.println(myString.indexOf("   "));

        //Problem 5
        String myLetter = "Dear Harry,\n\t This Java Course is Nice!\nThanks";
        System.out.println(myLetter);
    }


}
