package DynamicProgramming.SlidingWindow;
public class MaxSumOfSubArray {


    public static int bruteForceFindMaxSumSubArray(int k, int[] arr) {
        int maxSum = 0, windowSum, timeComplexityCount = 0;
        for (int i = 0; i <= arr.length - k; i++) {
            windowSum = 0;
            for (int j = i; j < i + k; j++) {
                timeComplexityCount++;
                windowSum += arr[j];
            }
            maxSum = Math.max(maxSum, windowSum);
        }
        System.out.println("Time Complexity by Brute Force " + timeComplexityCount);
        return maxSum;
    }

    public static int slidingWindowFindMaxSumSubArray(int k, int[] arr) {
        int windowSum = 0, maxSum = 0, timeComplexityCount = 0 ;
        int windowStart = 0;
        for (int windowEnd = 0; windowEnd < arr.length; windowEnd++) {
            timeComplexityCount++;
            windowSum += arr[windowEnd]; // add the next element
            // slide the window, we don't need to slide if we've not hit the required window size of 'k'
            if (windowEnd >= k - 1) {
                maxSum = Math.max(maxSum, windowSum);
                windowSum -= arr[windowStart]; // subtract the element going out
                windowStart++; // slide the window ahead
            }
        }
        System.out.println("Time Complexity by Sliding Window " + timeComplexityCount);
        return maxSum;
    }

    public static void main(String[] args) {
        System.out.println("Brute Force Maximum sum of a Sub Array of size K: "
                + MaxSumOfSubArray.bruteForceFindMaxSumSubArray(3, new int[]{2, 1, 5, 1, 3, 2}));
        System.out.println("Sliding Window Maximum sum of a Sub Array of size K: "
                + MaxSumOfSubArray.slidingWindowFindMaxSumSubArray(3, new int[]{2, 1, 5, 1, 3, 2}));
    }
}