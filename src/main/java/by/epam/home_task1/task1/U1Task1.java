package by.epam.home_task1.task1;

public class U1Task1 {
    public static void main(String[] args) {
        int number = (int) (Math.random() * 100);
        System.out.println(" Number: " + number
                + "\n Last digit of squared last digit: " + findSquareLastDigit(number));
    }

    public static int findSquareLastDigit(int number) {
        int lastNumbersDigit = lastDigit(number);
        int squaredLastDigit = lastNumbersDigit * lastNumbersDigit;
        return squaredLastDigit % 10;
    }

    public static int lastDigit(int number) {
        return number % 10;
    }
}
