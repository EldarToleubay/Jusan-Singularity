import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner in = new Scanner(System.in);

        int x = in.nextInt();
        int one;
        int ten;
        int hundred;
        if (x<0){
            x=Math.abs(x);
            one = ((x%100)%10);
            ten = ((x%100)-one);
            hundred = x - ten - one;
            one*=100;
            hundred/=100;
            System.out.println(-(hundred+one+ten));
        }else {
            one = ((x%100)%10);
            ten = ((x%100)-one);
            hundred = x - ten - one;
            one*=100;
            hundred/=100;
            System.out.println(hundred+one+ten);
        }
    }
}
