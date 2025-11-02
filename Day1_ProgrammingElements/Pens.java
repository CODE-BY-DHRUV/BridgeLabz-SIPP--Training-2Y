import java.util.Scanner;

public class Pens {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pens = sc.nextInt();
        int rem = 0 ;
        int given = 0;
        if (pens%3 == 0){
            rem = 0;
            given = pens / 3;
        }
        else{
            rem = pens % 3;
            given = pens / 3 ;
        }
        System.out.println("The Pen Per Student is " + given + " and the remaining pen not distributed is \n" + rem );
    }
}
