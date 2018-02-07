public class ExceptionUsingTryCatchExample {
    public static void main(String[] args) {
        System.out.println("start");
        try {
            System.out.println(10/0);
        }
        catch (Exception e) {
            System.out.println(10 / 2);
        }
        System.out.println("End");
    }
}
