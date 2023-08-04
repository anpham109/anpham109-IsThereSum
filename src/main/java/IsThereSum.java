
public class IsThereSum {
    /**
     * Check if there exist two numbers in an array add up to some other number.
     * You will likely need a for loop nested inside of another for loop for this problem - each for loop checking
     * sums of two different indexes of arr.
     *
     * @param arr an array of ints.
     * @param target a hypothetical sum of two numbers.
     * @return true if two separate values in the array add up to a target, false otherwise.
     */
    public boolean check(int[] arr, int target){
        for(int i1 = 0; i1 < arr.length; i1++){
            for(int i2 = 0; i2 < arr.length; i2++){
                if(i1 != i2 && (arr[i1] + arr[i2]) == target){
                    return true;
                }
            }
        }
        return false;
    }
}
