public class ExceptionWithoutTryCatch {
    public static void main(String[] args) {
        System.out.println("Start");//abnormal termination of the program
        System.out.println(10/0);
        System.out.println("End");
    }
}
