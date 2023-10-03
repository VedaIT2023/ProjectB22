public class SecondMaxNumberInString {
    public static void main(String[] args) {
        String numbersString = "52 34 56 76 789 90 465 354";
        String[] numbersArray = numbersString.split(" ");

        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (String numStr : numbersArray) {
            int num = Integer.parseInt(numStr);

            if (num > max) {
                secondMax = max;
                max = num;
            } else if (num > secondMax && num < max) {
                secondMax = num;
            }
        }

        System.out.println("Second maximum number: " + secondMax);
    }
}
