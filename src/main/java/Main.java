import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter something");
        Scanner sc = new Scanner(System.in);
        String userInput = sc.nextLine();

        if (StringUtils.isNumeric(userInput)) {
            System.out.println(userInput + " is a number");
        } else {
            System.out.println(userInput + " is not a number");
        }

        System.out.println("Swapped case: " + StringUtils.swapCase(userInput));

        System.out.println("Reversed: " + StringUtils.reverse(userInput));

    }
}
