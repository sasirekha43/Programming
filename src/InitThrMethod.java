class employee{
    int id;
    String name;
    void insertrecord(int i, String n){
       id = i;
       name = n;

    }
    void displayinformation(){
        System.out.println(id+ " "+name);
    }
}
public class InitThrMethod {
    public static void main(String[] args) {
        employee e1 = new employee();//e1 and e2 are reference variables that refer to the objects located in memory
        employee e2 = new employee();
        e1.insertrecord(111, "Sasi");
        e2.insertrecord(112, "Rekha");
        e1.displayinformation();
        e2.displayinformation();
    }
}
