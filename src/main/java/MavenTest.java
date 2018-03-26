import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class MavenTest {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Something: ");

        String userInput = sc.nextLine();

        System.out.println("You Entered: " + "\"" +  userInput + "\"");

        String message;
        if (stringIsANumber(userInput)) {
            message = " is a number";
        } else {
            message = " is not a number";
        }

        System.out.println(userInput + message);
        System.out.println("Flipped Case: " + flipTheStringCase(userInput));
        System.out.println("Reversed: " + reverseTheString(userInput));

        // expected output

//        Enter Something: Life, The Universe, and Everything
//        You Entered: "Life, The Universe, and Everything"
//        "Life, The Universe, and Everything" is not a number
//        Flipped Case: lIFE, tHE uNIVERSE, AND eVERYTHING
//        Reversed: gnihtyrevE dna ,esrevinU eht ,efiL

    }

    public static boolean stringIsANumber(String input) {
        return StringUtils.isNumeric(input);
    }

    public static String flipTheStringCase(String input) {
        return StringUtils.swapCase(input);
    }

    public static String reverseTheString(String input) {
        return StringUtils.reverse(input);
    }

}