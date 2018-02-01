public class IfElseIf {
    public static void main(String[] args) {
        int marks = 35;


        if(marks >=60 && marks <70) {
            System.out.print("Grade A");
        } else if(marks >=50 && marks < 60){
            System.out.print("Grade B");
        }
        else if(marks >=40 && marks <50)
        {
            System.out.print("Grade c");
        }
        else if(marks >=30 && marks <40){
            System.out.print("Grade D");
        }
        else{
            System.out.print("Invalid");
        }
    }


}


