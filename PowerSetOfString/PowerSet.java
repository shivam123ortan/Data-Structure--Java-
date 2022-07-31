import java.util.*;

public class PowerSet {

    static void power(String s, int index, String cur){
        int n = s.length();
 
        // base case
        if (index == n)
        {
            return;
        }
 
        // First print current subset
        System.out.println(cur);
 
        // Try appending remaining characters
        // to current subset
        for (int i = index + 1; i < n; i++)
        {
            cur += s.charAt(i);
            power(s, i, cur);
 
            // Once all subsets beginning with
            // initial "curr" are printed, remove
            // last character to consider a different
            // prefix of subsets.
            cur = cur.substring(0, cur.length() - 1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int i = -1;
        String cur = "";
        power(s, i, cur);
        
    }
}
