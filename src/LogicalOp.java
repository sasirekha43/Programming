public class LogicalOp {
    public LogicalOp(){
        Boolean x=true, y=false;
        System.out.println("x^y:"+(x^y));
        System.out.println("x&y:"+(x&y));
        System.out.println("x||y:"+(x||y));
        System.out.println("x&&y:"+(x&&y));

    }

    public static void main(String[] args) {
        new LogicalOp();
    }
}
