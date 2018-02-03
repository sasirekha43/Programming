import java.util.Scanner;

public class ReverseNum {
    public static void main(String[] args) {
        int num = 0;
        int reverse =0;
        System.out.println("Input your number and press enter: ");
        Scanner in = new Scanner(System.in);
        num = in.nextInt();

            while (num > 0) {
                int r = num % 10;
                reverse = reverse * 10 + r;
                num /= 10;
            }
        System.out.println("Specified number is :"+reverse);
        }

    }






