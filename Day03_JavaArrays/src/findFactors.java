import java.util.Scanner;
import java.util.Arrays;
public class findFactors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] prime = new int[n];
        int j= 0;
        for(int i=1;i<=n;i++){
            if(n%i == 0){
                prime[j] = i;
                j++;
            }
        }
        System.out.println(Arrays.toString(prime));
    }
}
