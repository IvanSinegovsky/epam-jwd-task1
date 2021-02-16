package by.epam.task1.task4;

public class U1Task4 {
    public static void main(String[] args) {
        int[] numbers = new int[4];
        numbers[0] = 2;
        numbers[1] = 2;
        numbers[2] = 2;
        numbers[3] = 2;

        System.out.println(twoOrMoreEvenNumbers(numbers));
    }

    public static boolean twoOrMoreEvenNumbers(int[] numbers) {
        if (numbers.length != 4) {
            return false;
        }

        int evenNumbersQuantity = 0;

        for (int i = 0; i < 4; i++) {
            if (numbers[i] % 2 == 0 && numbers[i] != 0) {
                evenNumbersQuantity++;

                if (evenNumbersQuantity == 2) {
                    return true;
                }
            }
        }

        return false;
    }
}