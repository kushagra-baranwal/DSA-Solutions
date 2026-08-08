import java.util.*;
class Solution {
    public int[] twoSum(int[] numbers, int target) {
        for(int i=0; i<numbers.length; i++)
        {
            int j = Arrays.binarySearch(numbers, i+1, numbers.length, target-numbers[i]);
            if(j>=0 && j!=i)
            return new int[]{i+1,j+1};
        }
        return new int[]{0,0};
    }
}