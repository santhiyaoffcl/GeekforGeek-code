class Solution {
    static ArrayList<Integer> subarraySum(int[] arr, int target) {
        ArrayList<Integer> value = new ArrayList<>();
        int start = 0;
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i]; 
            
            while (sum > target && start <= i) {
                sum -= arr[start];
                start++;
            }
        if (sum == target) {
                value.add(start + 1); 
                value.add(i + 1); 
                return value;
            }
        }
       value.add(-1);
        return value;
    }
}
