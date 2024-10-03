// Q3. Create an Abstract class Student that contains a method take  exam, implement the method in the  child  classes  PhdStudent  and  GradStudent  in  which PhdStudent  takesexam  by giving his final defense presentation while the graduate student gives a writtenpaper.abstract class Student {
    abstract void takeExam();
}

class PhdStudent extends Student {
    public void takeExam() {
        System.out.println("PhD student is giving a final defense presentation.");
    }
}

class GradStudent extends Student {
    public void takeExam() {
        System.out.println("Graduate student is giving a written paper.");
    }
}

public class Main {
    public static void main(String[] args) {
        Student phd = new PhdStudent();
        Student grad = new GradStudent();

        phd.takeExam();
        grad.takeExam();
    }
}
