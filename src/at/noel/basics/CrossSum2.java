package at.noel.basics;

public class CrossSum2 {

    public static void main(String[] args) {
        for (int i = 0; i < 1000; i++) {
            String numberInString = Integer.toString(i);
            char[] numbers = numberInString.toCharArray();
            int sum = 0;
            for (int j = 0; j < numbers.length; j++) {
                sum = sum + Character.getNumericValue(numbers[j]);

            }
            if (sum % 7 == 0) {
                System.out.println("Number: " + i + "  Quersumme: " + sum);
            }
        }
    }
}
