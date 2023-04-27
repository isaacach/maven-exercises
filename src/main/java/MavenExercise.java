import java.util.Scanner;

import static java.lang.Float.parseFloat;
import static org.apache.commons.lang3.StringUtils.reverse;
import static org.apache.commons.lang3.StringUtils.swapCase;

public class MavenExercise {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter something");
        String userInput = sc.next();
        try {
            parseFloat(userInput);
            System.out.println("is number");
        } catch (IllegalArgumentException e) {
            System.out.println("is not number");
        }

        System.out.println("Swapped case => " + swapCase(userInput));
        System.out.println("Reversed => " + reverse(userInput));
    }

}
