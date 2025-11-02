import java.util.Scanner;
public class CylinderVol {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r  = sc.nextInt();
        int h = sc.nextInt();
        int volume = (int) (Math.PI * Math.pow(r,2) * h);
        System.out.println("Volume as int: " + volume);
    }
}
