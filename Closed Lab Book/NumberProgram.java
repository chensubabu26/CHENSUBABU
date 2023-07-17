package temp;

public class NumberProgram {
    public static void main(String[] args) {
        generatePrimeNumbers(1, 100);
        checkNumberProperties(153); // Example number for testing Armstrong, perfect, and palindrome properties
    }

    public static void generatePrimeNumbers(int start, int end) {
        System.out.println("Prime numbers between " + start + " and " + end + ":");
        for (int number = start; number <= end; number++) {
            if (isPrime(number)) {
                System.out.print(number + " ");
            }
        }
        System.out.println();
    }

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void checkNumberProperties(int number) {
        System.out.println("Checking properties for number: " + number);
        if (isArmstrong(number)) {
            System.out.println(number + " is an Armstrong number.");
        } else if (isPerfect(number)) {
            System.out.println(number + " is a Perfect number.");
        } else if (isPalindrome(number)) {
            System.out.println(number + " is a Palindrome number.");
        } else {
            System.out.println(number + " is neither an Armstrong, Perfect, nor Palindrome number.");
        }
    }

    public static boolean isArmstrong(int number) {
        int originalNumber = number;
        int result = 0;
        int n = String.valueOf(number).length();

        while (number != 0) {
            int digit = number % 10;
            result += Math.pow(digit, n);
            number /= 10;
        }

        return result == originalNumber;
    }

    public static boolean isPerfect(int number) {
        int sum = 0;

        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }

        return sum == number;
    }

    public static boolean isPalindrome(int number) {
        int reversedNumber = 0;
        int originalNumber = number;

        while (number != 0) {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number /= 10;
        }

        return reversedNumber == originalNumber;
    }
}
