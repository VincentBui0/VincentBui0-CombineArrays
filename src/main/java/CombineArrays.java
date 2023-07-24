
public class CombineArrays {
    /**
     * Combine two arrays into a single array and return it.
     *
     * @param arr1 an array of ints.
     * @param arr2 an array of ints.
     * @return an array containing the contents of arr1 followed by the contents of arr2.
     */
    public int[] combine(int[] arr1, int[] arr2){
    // Calculate the lengths of the input arrays
    int length1 = arr1.length;
    int length2 = arr2.length;

    // Create a new array to store the combined elements
    int[] combinedArray = new int[length1 + length2];

    // Copy elements from arr1 to the combinedArray
    for (int i = 0; i < length1; i++) {
    combinedArray[i] = arr1[i];
    }

    // Copy elements from arr2 to the combinedArray
    for (int i = 0; i < length2; i++) {
    combinedArray[length1 + i] = arr2[i];
    }

    return combinedArray;
    }
}