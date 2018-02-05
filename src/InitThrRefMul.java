class student1{
    int id;
    String name;
        }

public class InitThrRefMul {
    public static void main(String[] args) {
        student s1 = new student();//creating multiple objects and storing values in the objects
        student s2 = new student();
        s1.id= 102;
        s1.name = "Sasi";
        s2.id =103;
        s2.name ="Rekha";
        System.out.println(s1.id+ " "+ s1.name);
        System.out.println(s2.id+ " "+s2.name);
    }

}
