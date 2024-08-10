import java.util.Scanner;

public class Main {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        // Task 1 Finding Fictorial
        System.out.println("*******<task 1>*******");
        System.out.println("Enter number to find its fictorial: ");
        int fic = input.nextInt();
        input.nextLine();
        System.out.println("Fictorial of " + fic + ": " + fictorial(fic));

        //Task 2 Palindrom
        System.out.println("*******<task 2>*******");
        System.out.println("Enter a string to find if its palindrome or not: ");
        String str = input.nextLine();
        if (isPalindrome(str)) {
            System.out.println(str + " is palindrome");
        } else {
            System.out.println(str + " is not palindrome");
        }

        // Task 3 Count digit
        System.out.println("*******<task 3>*******");
        System.out.println("Enter a number: ");
        int num = input.nextInt();
        System.out.println("Enter digit you want to count: ");
        int digit = input.nextInt();
        System.out.println("Digit " + digit + " repeated " + countDigit(num, digit) + " times");

        //Task 4 Hand Shakes
        System.out.println("*******<task 4>*******");
        System.out.println("Enter number of persons: ");
        int person = input.nextInt();
        System.out.println("handshake(" + person + ")= " + handshakes(person));

        //Task 5 Greatest Common Divisor
        System.out.println("*******<task 5>*******");
        System.out.println("Enter first number: ");
        int num1 = input.nextInt();
        System.out.println("Enter second number: ");
        int num2 = input.nextInt();
        System.out.println("GCD of " + num1 + " and " + num2 + " : " + GCD(num1, num2));

        //Task 6 power calculation
        System.out.println("*******<task 6>*******");
        System.out.println("Enter base: ");
        int base = input.nextInt();
        System.out.println("Enter exponent: ");
        int exp = input.nextInt();
        input.nextLine();
        System.out.println("value: " + power(base, exp));

        //Task 7 Reverse function
        System.out.println("*******<task 7>*******");
        System.out.println("Enter any string: ");
        String str1 = input.nextLine();
        int len = str1.length();
        System.out.println("Reverse of string: " + reverse(str1, len));

    }

    private static int fictorial(int num) {
        int fic = 1;
        for (int i = num; i >= 1; i--) {
            fic *= i;
        }
        return fic;
    }

    //
    private static boolean isPalindrome(String value) {
        value = value.replace(" ", "");
        StringBuilder str = new StringBuilder(value);
        str.reverse();
        if (value.equalsIgnoreCase(str.toString().trim())) {
            return true;
        }
        return false;
    }

    private static int count = 0;
    private static int index = 0;

    private static int countDigit(int num, int digit) {
        char[] numChars = Integer.toString(num).toCharArray();
        if (index < numChars.length) {
            count += (numChars[index] == Character.forDigit(digit, 10)) ? 1 : 0;
            index++;
            countDigit(num, digit);
        }
        return count;
    }

    private static int handshakes(int persons) {
        if (persons <= 1) {
            return 0;
        }
        return handshakes(persons - 1) + (persons - 1);
    }

    private static int GCD(int num1, int num2) {
        int remainder = num1 % num2;
        if (remainder == 0) {
            return num2;
        } else {
            return GCD(num2, remainder);
        }
    }

    private static int power(int base, int exp) {
        if (exp < 0) {
            System.out.println("Exponent cannot be negative ");
            return -1;
        }
        if (exp == 0) {
            return 1;
        } else if (exp != 1) {
            return base * power(base, exp - 1);
        }
        return base;
    }

    private static String reverse(String str, int length) {
        if (length <= 0) {
            return "";
        }
        return str.charAt(length - 1) + reverse(str, length - 1);
    }

}
