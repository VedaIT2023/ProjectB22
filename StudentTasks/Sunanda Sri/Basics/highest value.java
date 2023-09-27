public class HighestValueFinder {
    public static int findHighestValue(String input) {
        String[] numbersAsStrings = input.split("\\D+");
        int highestValue = Integer.MIN_VALUE;

        for (String numStr : numbersAsStrings) {
            if (!numStr.isEmpty()) {
                int num = Integer.parseInt(numStr);
                highestValue = Math.max(highestValue, num);
            }
        }

        return highestValue;
    }

    public static void main(String[] args) {
        String input = "12,34,56,76,54,78,98,90,21,33,99,1001,560";
        int highestValue = findHighestValue(input);
        System.out.println("Input string: " + input);
        System.out.println("Highest value: " + highestValue);
    }
}
