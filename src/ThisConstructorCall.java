class Student5{
    int rollno;
    String name,course;
    float fee;
    Student5(int rollno,String name, String course){
        this.rollno =rollno;
        this.name = name;
        this.course= course;
    }
    Student5(int rollno, String name, String course, float fee){
        //other wise it will get the compile time error.
        this(rollno,name,course);//reusing constructor and need to must be in first statement.
        this.fee = fee;

    }
    void display(){
        System.out.println(rollno+ " " +name+" "+course+" "+fee);
    }
}

public class ThisConstructorCall {
    public static void main(String[] args) {
        Student5 s1 = new Student5(111, "sasi", "MCA", 20000f);
        Student5 s2 = new Student5(121, "Nani", "MBA");
        s1.display();
        s2.display();

    }
}
