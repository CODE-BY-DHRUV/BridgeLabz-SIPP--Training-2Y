public class BridgeLabz {
    public static void main(String[] args) {
        System.out.println("Welcome to Bridgelabz!");
         int[] nums = {1, 2, 3};
        int k = 3;

        int result = subarraySum(nums, k);
        System.out.println("Total subarrays with sum " + k + " = " + result);
    }

        public static int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> prefixSumCount = new HashMap<>();
        prefixSumCount.put(0, 1);  // base case: sum=0 appears once

        int count = 0;
        int prefixSum = 0;

        for (int i = 0; i < nums.length; i++) {
            prefixSum += nums[i];

            // Check if prefixSum - k exists in the map
            if (prefixSumCount.containsKey(prefixSum - k)) {
                int freq = prefixSumCount.get(prefixSum - k); // <-- accessing frequency
                count += freq;
                System.out.println("At index " + i + ": found " + freq 
                                   + " subarray(s) ending here with sum " + k);
            }

            // Update frequency of current prefixSum
            prefixSumCount.put(prefixSum, prefixSumCount.getOrDefault(prefixSum, 0) + 1);

            // Debug print
            System.out.println("After index " + i + ": prefixSum=" + prefixSum 
                               + ", map=" + prefixSumCount);
        }

        return count;
    

   
}
}
