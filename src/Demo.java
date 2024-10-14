class Student{
    String name;
    int age;

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }

    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return this.age;
    }

}
public class Demo {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("John Doe");
        student.setAge(20);
        System.out.println("Name: " + student.getName());
        System.out.println("Age: " + student.getAge());
    }
}
