// Traversing a string using Recursion 
public class StringTraversing {
    public static void main(String[] args) {
        String s = "Prakhar shukla";
        traversingString(0, s);
        System.out.println();
        skipChar(0, s, "");
    }

    public static void traversingString(int i, String s) {
        if (i == s.length()) {
            return;
        }
        System.out.print(s.charAt(i));
        traversingString(i + 1, s);
    }

    // Skip the particular from the string using Recursion
    public static void skipChar(int i, String s, String ans) {
        if (i == s.length()) {
            System.out.print(ans);
            return;
        }
        if (s.charAt(i) != 'a') {
            ans += s.charAt(i);
        }
        skipChar(i + 1, s, ans);

    }
}
