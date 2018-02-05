class Student4{
    int rollno;
    String name;
    static String college ="GIET";
   Student4(int r, String n){
       rollno = r;
       name = n;
   }
  void display(){
      System.out.println(rollno+" "+name+ " "+college);
  }
}
public class StaticExample {
    public static void main(String[] args) {
        Student4 s1 = new Student4(111, "sasi");
        Student4 s2 = new Student4(112, "rekha");
        s1.display();
        s2.display();
    }
}
