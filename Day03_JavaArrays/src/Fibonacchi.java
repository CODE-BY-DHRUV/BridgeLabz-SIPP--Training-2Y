import java.util.Scanner;
import java.util.Arrays;
public class Fibonacchi {
    public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                int n = sc.nextInt();
                /*int first=0;
                int second=1;
                if(n<=0){
                    System.out.println("Wrong input !");
                    return;
                }
                if (n == 1) {
                    System.out.println(first+" ");
                } else if(n==2){
                    System.out.println(first+" "+second+" ");
                } else {
                    System.out.print(first+" "+second+" ");
                    for(int i=3;i<=n;i++){
                        int next=first+second;
                        System.out.print(next+" ");
                        first=second;
                        second=next;
                    }
                }
                 */
        System.out.println(Arrays.toString(fibonacchi(n)));

            }
            public static int[] fibonacchi(int n) {
                if (n == 0) {
                    System.out.println("wrong input");
                }
                else if (n == 1) {
                    return new int[]{0};
                }
                else if (n == 2) {
                    return new int[]{0,1};
                }
                else{
                    int first = 0;
                    int second = 1;
                    for(int i=first;i<=n;i++){
                        int temp  = 0;
                        int next = i + i+1;
                        int temp2 = 0;
                        second  = temp;
                        temp = next;
                        first = temp2;  //first  = second
                        temp2 = second; //second = next
                        return new int[]{first,second,next};
                    }

                }
                return new int[]{-1,-1};
            }

        }


