// N Person sits in a circle and shoots the Kth position person from him
// Bring out the position of the person who will be alive in last.

import java.util.*;

public class Josephus {
    static int alive(int n, int k){
        if(n==1){
            return 0;
        }
        return (alive(n-1, k) + k)%n;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        System.out.println(alive(n,k));
    }
}
