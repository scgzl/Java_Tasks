package all_tasks;

public class SumTheDigits {
    public static void main(String[] args) {


        int number = 625; // 9 + 9 + 9 = 27
        // 233 >> 2 + 3 + 3 = 8

        int thirdDigit = number / 100; // 9 >> add this numbr

        int remainingNumber = number % 100; // 87 >> this is not to add, this is just to find the next number to make operation

        int secondDigit = remainingNumber / 10; // 8 >> add this number

        remainingNumber = remainingNumber % 10; // 7 >> this is not to add, this is just to find the next number to make operation

        int firstDigit = remainingNumber / 1; // 7 add this number

        int sum = firstDigit + secondDigit + thirdDigit;

        System.out.println("The sum of the digits are: " + sum);
}}
