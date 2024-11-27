import java.util.ArrayList;
import java.util.List;

public class ArrayPermutation {
    public static void main(String[] args) {
        List<List<Integer>> result = new ArrayList<>();
        int nums[] = { 1, 2, 3 };
        backtrack(result, new ArrayList<>(), nums);
        System.out.println(result);
    }

    public static void backtrack(List<List<Integer>> result, List<Integer> ans, int[] nums) {
        if (ans.size() == nums.length) {
            result.add(new ArrayList<>(ans));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (ans.contains(nums[i])) {
                continue;
            }
            ans.add(nums[i]);
            backtrack(result, ans, nums);
            ans.remove(ans.size() - 1);
        }
    }
}
