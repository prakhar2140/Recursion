import java.util.*;

public class Consecutive1s {
    public static void main(String[] args) {
        int N = 4;
        List<String> ans = new ArrayList<>();
        solve(N, ans, 0, "", false);
        System.out.println(ans);
    }

    public static void solve(int n, List<String> ans, int i, String temp, boolean flag) {
        if (i == n) {
            ans.add(temp);
            return;
        }
        if (flag == false) {
            solve(n, ans, i + 1, temp + "0", false);
            solve(n, ans, i + 1, temp + "1", true);
        } else {
            solve(n, ans, i + 1, temp + "0", false);
        }
    }
}
