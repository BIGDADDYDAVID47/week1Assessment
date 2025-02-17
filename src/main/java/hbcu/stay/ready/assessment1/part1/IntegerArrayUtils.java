package hbcu.stay.ready.assessment1.part1;

/**
 * Created by leon on 2/16/18.
 */
public class IntegerArrayUtils {
    /**
     * @param intArray an array of integers
     * @return the sum of `intArray`
     */
    public static Integer getSum(Integer[] intArray) {
        int arr[] = {1, 2, 3, 4, 5};

        static int sum()
        {
            int sum = 0;
            int i;
            for (i = 0; i < arr.length; i++)
                sum += arr[i];

            return sum;

        }
    /**
     * @param intArray an array of integers
     * @return the product of `intArray`
     */
    public static Integer getProduct(Integer[] intArray, int n) {

        int result = 1;
        for (int i = 0; i < n; i++)
            result = result * intArray[i];
        return result;

    }

    /**
     * @param intArray an array of integers
     * @return the sum of `intArray` divided by number of elements in `intArray`
     */
    public static Double getAverage(Integer[] intArray, int n) {
        int input = 0;

        for (int i = 0; i<n; i++)
            input +=[i];
        return input/n;
    }

    /**
     * @param intArray an array of integers
     * @return the largest integer in intArray
     */
    public static Integer getLargest(Integer[] intArray) {

    int i;
    int max = arr [0];
    for (i = 1; i <arr.length; i++)
        if (arr[i] > max)
            max = arr[i];
        return max;
}