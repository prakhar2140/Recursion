// Write a program to find subset of the array using recursion
public class SubsetsOfArray {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3 };
        int[] ans = {};
        subsetOfArray(0, arr, ans);
    }

    public static void subsetOfArray(int i, int[] arr, int[] ans) {
        int ele = arr[i];
        if (i == arr.length) {
            ans[i] = ele;
            return;
        }
        subsetOfArray(0, arr, ans);
        subsetOfArray(0, arr, ans);
    }
}
