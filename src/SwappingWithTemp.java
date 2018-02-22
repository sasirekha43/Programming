import java.util.Scanner;
public class SwappingWithTemp {
    public static void main(String args[]) {
        int x, y, temp;
        System.out.println("Enter x and y");
        Scanner in = new Scanner(System.in);

        x = in.nextInt();
        y = in.nextInt();

        System.out.println("Before Swapping  x = "+x+" y = "+y);

        temp = x;
        x = y;
        y = temp;

        System.out.println("After Swapping x = "+x+" y = "+y);
    }
}
