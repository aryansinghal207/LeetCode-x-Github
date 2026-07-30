class Solution {
    public static void revsort(int[] arr) {
        Arrays.sort(arr);
        int i = 0, j = arr.length - 1;
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
    public void wiggleSort(int[] nums) {
        int n = nums.length;
        int[] first = new int[(n + 1) / 2];
        int[] second = new int[n / 2];
        Arrays.sort(nums);
        for (int i = 0; i < first.length; i++) first[i] = nums[i];
        for (int i = 0; i < second.length; i++) second[i] = nums[first.length + i];
        revsort(first);
        revsort(second);
        int f = 0, s = 0;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                nums[i] = first[f++];
            } else {
                nums[i] = second[s++];
            }
        }
    }
}