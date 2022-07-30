// Find the only non repeating element in an array where
// every elements repeats twice.
 
public class NonRepInTwo {

    static int solution(int a[]){
        int res = 0;
        for(int i=0; i<a.length; i++){
            res = res ^ a[i];
        }
        return res;
    }
    public static void main(String[] args) {
        
        int a[] = {5, 4, 1, 4, 3, 5, 1};
        System.out.println(solution(a));

    }
}