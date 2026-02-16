//
//

// Leetcode problem no 88

/*
 * 1st Way : In this problem we first solve by brute first solution by using
 * temp array
 * but we have to solve it in O(1) time complexity
 * 
 * public void merge(int[] nums1, int m, int[] nums2, int n) {
 * int[] temp = new int[m + n];
 * 
 * int i = 0;
 * int j = 0;
 * int k = 0;
 * 
 * while (i < m && j < n) {
 * if (nums1[i] < nums2[j])
 * temp[k++] = nums1[i++];
 * else
 * temp[k++] = nums2[j++];
 * }
 * 
 * while (i < m) {
 * temp[k++] = nums1[i++];
 * }
 * 
 * while (j < n) {
 * temp[k++] = nums2[j++];
 * }
 * 
 * for (int x = 0; x < m + n; x++) {
 * nums1[x] = temp[x];
 * }
 * }
 * 
 * 
 * 2nd Way : means we have to solve without using an array
 * Here we have not used an array ,we stored an elements in first array where we
 * have given an extra space in the form of 0 at that position with the size of
 * second array
 * 
 * public void merge(int[] nums1, int m, int[] nums2, int n) {
 * 
 * int i = m - 1;
 * int j = n - 1;
 * int k = m + n - 1;
 * 
 * while (i >= 0 && j >= 0) {
 * if (nums1[i] > nums2[j])
 * nums1[k--] = nums1[i--];
 * else
 * nums1[k--] = nums2[j--];
 * }
 * 
 * while (i >= 0) {
 * nums1[k--] = nums1[i--];
 * }
 * 
 * while (j >= 0) {
 * nums1[k--] = nums2[j--];
 * }
 * }
 * 
 */