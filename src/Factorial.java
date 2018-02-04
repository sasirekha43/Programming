public class Factorial {
    public static void main(String[] args) {
        int i, number = 4;
        int fact =1;

        for(i =1; i<=number;i++){
            fact = fact * i;
        }
        System.out.print("Factorial of "+number+" is: "+fact);
    }

}
