import java.util.*;

public class Palindrome {

    static boolean isPalin(char[] s, int l, int h){

        if (l>=h){
            return true;
        }
        if (s[l] != s[h]){
            return false;
        }
        return isPalin(s, l+1, h-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String ");
        String s = sc.next();
        System.out.println("Enter the length ");
        int h = sc.nextInt();
        int l = 0;
        sc.close();
        char [] arr = s.toCharArray();
        
        System.out.println(isPalin(arr, l, h-1));
    }    
}
