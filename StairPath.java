/* 
Find no of ways to reach nth stairs if 1 or 2 jump at a time is allowed
n is no of steps = 5
Ways to reach at top 1 1 1 1 1  
Ways to reach at top 1 1 1 2
Ways to reach at top 1 1 2 1
Ways to reach at top 1 2 1 1
Ways to reach at top 2 1 1 1
Ways to reach at top 2 2 1 
Ways to reach at top 2 1 2 
Ways to reach at top 1 2 2 

*/
public class StairPath {
    public static void main(String[] args) {
        int x = stairPath(5);
        System.out.println(x);
    }

    public static int stairPath(int n) {
        if (n == 1 || n == 2) {
            return n;
        }
        return stairPath(n - 1) + stairPath(n - 2);
    }
}
