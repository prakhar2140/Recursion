// Write a program to print subset of the string using recursion 
public class SubsetsOfString {
    public static void main(String[] args) {
        String s = "abc";
        subSetOfString(0, s, "");
    }

    public static void subSetOfString(int i, String s, String ans) {
        if (i == s.length()) {
            System.out.println(ans);
            return;
        }
        char ch = s.charAt(i);
        subSetOfString(i + 1, s, ans + ch);
        subSetOfString(i + 1, s, ans);
    }
}
