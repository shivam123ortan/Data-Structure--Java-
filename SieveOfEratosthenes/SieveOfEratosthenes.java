// To get all the prime number b/w a range

import java.util.*;

import javax.sound.midi.Soundbank;

public class SieveOfEratosthenes {

    static boolean [] solution(int n){
        boolean isPrime[] = new boolean[n+1];
        Arrays.fill(isPrime, true);
        isPrime[0] = false;
        isPrime[1] = false;

        for(int i=2; i*i<=n; i++){
            if (isPrime[i] == true){
                for(int j=2*i; j<=n; j+=i){
                    isPrime[j] = false;
                }
            }
        }
        return isPrime;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        boolean arr[] = solution(n);
        for(int i=0; i<arr.length; i++){
            System.out.println(i + "->" + arr[i]);
        }

    }
}
