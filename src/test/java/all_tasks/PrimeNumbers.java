package all_tasks;

public class PrimeNumbers {
    public static void main(String[] args) {
        //find the prime numbers till 100
        //*prime number it can be  only divisible by itself 1
        //2 3 5 7 11 13 17 etc.

        primeFinder(300);


    }

    public static void primeFinder(int num) {

        int count=0;
        for (int prime = 2; prime < num; prime++) {

            boolean isPrime = true;
            for (int divisor = 2; divisor < prime; divisor++) {
                if (prime % divisor == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) { count++;
                System.out.println(prime + " is a prime number");
            }
        }
        System.out.println("There are "+count+" number of prime numbers in "+num);
    }


}
