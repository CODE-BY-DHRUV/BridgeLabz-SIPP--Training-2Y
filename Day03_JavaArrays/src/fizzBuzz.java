import java.util.Scanner;

public class fizzBuzz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] s = new String[n];
        if(n >0){
            for(int i=0;i<=n;i++){
                if(i%3==0){
                    System.out.println("Fizz55");
                }
                if(i%5==0){
                    System.out.println("Buzz");
                }
                if(i%3==0 && i%5==0){
                    System.out.println("FizzBuzz");
                }
            }
        }
    }
}
