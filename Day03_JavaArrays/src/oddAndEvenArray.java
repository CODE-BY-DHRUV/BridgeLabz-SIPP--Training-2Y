import java.util.Scanner;
public class oddAndEvenArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] even = new int[250];
        int[] odd = new int[250];
        int j = 0;
        int k = 0;
        for(int i=1;i<=n;i++){
            if(i%2==0){

                even[j] = i;
                j++;
            }
            else{
                odd[k] = i;
                k++;
            }
        }
        System.out.print("Even numbers: ");
        for (int i = 0; i < j; i++) {
            System.out.print(even[i] + " ");
        }
        // print odd numbers
        System.out.print("\nOdd numbers: ");
        for (int i = 0; i < k; i++) {
            System.out.print(odd[i] + " ");
        }
    }
}
