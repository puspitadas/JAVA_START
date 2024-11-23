import java.util.Arrays;
import java.util.Scanner;

public class StringReverse {
    public static void main(String[] args) {
        System.out.println("Enter a word that you want to reverse:");
        Scanner sc3 = new Scanner(System.in);
        String word = sc3.next();
        String reverse=reverseTheString(word);
        System.out.println("The reversed word is:"+reverse);
    }

    private static String reverseTheString(String word) {
        char[] charArray = word.toCharArray();
        int left = 0;
        int right = charArray.length-1;
        while(left<right){
            char temp = charArray[left];
            charArray[left]=charArray[right];
            charArray[right]=temp;
            left++;
            right--;
        }
        return new String(charArray);
    }
}
