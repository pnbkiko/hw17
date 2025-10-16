package task4;

public class Palindrome {

    public boolean isPalindromeWord(String str) {
        StringBuilder sb = new StringBuilder(str);
        String p1 = sb.toString();
        String p2 = sb.reverse().toString();


        return p1.equals(p2);

    }
}