import java.util.Scanner;
public class Divisibleby5 {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int a = sc.nextInt();
        if(a%5==0){
            System.out.println(" Is the number " + a + "divisible by 5?" + "yes");
        }
        else{
            System.out.println(" Is the number " + a + "divisible by 5?" + "no");
        }


    }
}
