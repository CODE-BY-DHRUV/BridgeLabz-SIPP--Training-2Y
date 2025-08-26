import java.util.Scanner;
public class ArmstrongNumber {
    public static void main(String[] args) {
        //only for 3 digits
       /* Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int org = n;
        int count = 0;
        int sum = 0;
        while(n!=0){
            int x = n%10; // last digit
            sum = sum + (x*x*x);
            n=n/10;
        }
        if (sum==org){
            System.out.println("Armstrong no.");
        }
        else{
            System.out.println("not Armstrong no.");
        }*/
        //for any number of digits
        /*import java.util.Scanner;

        public class ArmstrongCheck {
            public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                int n = sc.nextInt();   // input number
                int org = n;

                // Step 1: count digits
                int count = 0;
                int temp = n;
                while (temp != 0) {
                    temp = temp / 10;
                    count++;
                }

                // Step 2: calculate sum of digits^count
                double sum = 0;
                temp = n;
                while (temp != 0) {
                    int x = temp % 10;
                    sum = sum + Math.pow(x, count);
                    temp = temp / 10;
                }

                // Step 3: check Armstrong condition
                if (sum == org) {
                    System.out.println("Armstrong no.");
                } else {
                    System.out.println("Not Armstrong no.");
                }
            }
        }*/
        Scanner sc = new Scanner(System.in);
    /*int n = sc.nextInt();
    String s = n+"";
    int length = s.length();

    double sum = 0 ;
    int org = n;
    while(n!=0){
        int x = n % 10;
        sum = sum + Math.pow(x,length);
        n = n / 10;
    }
        if (sum==org){
            System.out.println("Armstrong no.");
        }
        else{
            System.out.println("not Armstrong no.");
        }*/

                int n = sc.nextInt();   // input number
                int org = n;


                int count = String.valueOf(n).length();  //int to string


                double sum = 0;
                int temp = n;
                while (temp != 0) {
                    int x = temp % 10;
                    sum += Math.pow(x, count);
                    temp /= 10;
                }


                if (sum == org) {
                    System.out.println("Armstrong no.");
                } else {
                    System.out.println("Not Armstrong no.");
                }
            }
        }




