class Student3{
    int id;
    String name;

    Student3(int i, String n){
        id = i;
        name= n;
    }
    void display(){
        System.out.println(id+ " "+name);
    }
}
public class ParamConstrctr {
    public static void main(String[] args) {
        Student3 s1 = new Student3(111, "Sasi");
        Student3 s2 = new Student3(112, "Rekha");
        s1.display();
        s2.display();
    }
}
