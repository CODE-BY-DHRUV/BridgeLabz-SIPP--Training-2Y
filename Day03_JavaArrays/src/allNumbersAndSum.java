import java.util.Scanner;
public class allNumbersAndSum {
    public static void main(String[] args) {
        double[] arr = new double[10];
        Scanner sc = new Scanner(System.in);
        double total = 0;
        int i = 0;
        while(true) {
             Double num  = sc.nextDouble();
           if(arr[i] == 0 || arr[i] <0){
               break;
           }
            arr[i] = num;
            i++;
            if(i==10){
               break;
            }
        }
        for(int j=0;j<=arr.length-1;j++){
            total += arr[j];
        }
        System.out.println(total);
        }
    }

