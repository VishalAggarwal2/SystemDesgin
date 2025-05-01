// this class voiletes single use principle
class Student {
    public void printDetails() {
        System.out.println("Printing student details...");
    }

    public void saveToDatabase() {
        System.out.println("Saving to database...");
    }
}


// correct version of single use principle

class StudentCorrect {
    String name;

    StudentCorrect(String name) {
        this.name = name;
    }
}

class StudentPrinter {
    public void print(StudentCorrect student) {
        System.out.println("Student name: " + student.name);
    }
}

class StudentDatabase {
    public void save(StudentCorrect student) {
        System.out.println("Saving " + student.name + " to database.");
    }
}




public class SSingleUse {
//    “A class should have only one reason to change” which means every
//    class should have a single responsibility or single job or single purpose.
//    In other words, a class should have only one job or purpose within the software system.
}
