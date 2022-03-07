public class Problem002 {
    public static int solution() {
        int limit = 4000000;
        int firstNumber = 1;
        int secondNumber = 2;
        int sumOfEvenNumbers = 2;
        do {
            int temp = firstNumber + secondNumber; // happens first
            firstNumber = secondNumber;
            secondNumber = temp;
            if (secondNumber < limit) {
                if (secondNumber % 2 == 0) {
                    sumOfEvenNumbers += secondNumber;
                }
            }
        } while (secondNumber < limit);
        return sumOfEvenNumbers;
    }
}
