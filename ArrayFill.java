public class ArrayFill {
    public static void main(String[] args) {

        // VARIABLE DECLARATION
        int maxArray = 20;
        // ARRAY DECLARATION
        int[] numbers = new int[maxArray];
        // we have a new array and it will have 10 elements in it.
        // FILL ARRAY WITH VALUES
        // int added = 1;
        for (int pos = 0; pos < maxArray; pos++) {
            // added = added +2;
            // numbers[pos] = added;
            numbers[pos] = pos;
        }

        // PRINT VALUES CONTAINED IN THE ARRAY

        for (int pos = 0; pos < maxArray; pos++) {
            System.out.println(numbers[pos]);
        }
        
        int howLong = numbers.length;
        System.out.print(howLong);
    }
}
