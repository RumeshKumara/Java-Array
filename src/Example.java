class Student1{
    String name;
    int age;
    String grade;
    Student1(String name, int age, String grade){
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
}

class Kamal extends Student1{
    int marks;
    Kamal(String name, int age, String grade, int marks){
        super(name, age, grade);
        this.marks = marks;
    }
}

public class Example {
    public static void main(String[] args) {
        Kamal kamal = new Kamal("Kamal", 18, "A", 84);
        System.out.println("Name: " + kamal.name);
        System.out.println("Age: " + kamal.age);
        System.out.println("Grade: " + kamal.grade);
        System.out.println("Marks: " + kamal.marks);
    }
}
