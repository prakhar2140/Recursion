import java.util.ArrayList;
import java.util.List;

public class Combination {
    public static void main(String[] args) {
        int n = 5;
        int k = 3;
        List<List<Integer>> result = new ArrayList<>();
        backtrack(result, new ArrayList<>(), 1, n, k);
        System.out.println(result);
    }

    public static void backtrack(List<List<Integer>> result, List<Integer> ans, int start, int n, int k) {
        if (ans.size() == k) {
            result.add(new ArrayList<>(ans));
            return;
        }
        for (int i = start; i <= n; i++) {
            ans.add(i);
            backtrack(result, ans, i + 1, n, k);
            ans.remove(ans.size() - 1);
        }
    }

}
