package Assignment;


import java.util.*;

public class Student extends Person implements Comparable<Student> {

    private int roll_number ;
    private Standards standard ;
    private Subject subjects ;
    private Map marks ;

    public Student(String name, String address, Integer age, String DOB, Integer Id, int roll_number, Standards standard, Subject subjects, Map marks) {
        super(name, address, age, DOB, Id);
        this.roll_number = roll_number;
        this.standard = standard;
        this.subjects = subjects;
        this.marks = marks;
    }

    static void Speak() {
        System.out.println("This student is speaking");
    }

    static Student student1 = new Student("mike" ,"adjhasjl" , 23 , "12/04/2003" , 435633 , 32 , Standards.sample_class1 , Subject.Mathematics , Marks.One());
    static Student student2 = new Student("johny" ,"adjhasjl" , 19 , "05/12/2001" , 112366 , 12 , Standards.sample_class1 , Subject.Mathematics , Marks.Two());
    static Student student3 = new Student("duke" ,"adjhasjl" , 20 , "16/11/2003" , 123571 , 12 , Standards.sample_class1 , Subject.Mathematics , Marks.Three());
    static Student student4 = new Student("dom" ,"adjhasjl" , 21 , "21/06/2002" , 854162 , 3 , Standards.sample_class1 , Subject.Mathematics , Marks.Four());
    static Student student5 = new Student("wayne" ,"adjhasjl" , 20 , "18/01/2001" , 4552156 , 9 , Standards.sample_class1 , Subject.Mathematics , Marks.Five());





    static void PrintStudent(){

        List<Student> S_list = new ArrayList<>();

        S_list.add(0, student1 );
        S_list.add(1, student2 );
        S_list.add(2, student3 );
        S_list.add(3, student4 );
        S_list.add(4, student5 );


        System.out.println( S_list );
    }

    static void PrintSortedStudents  (){

        List<Student> S_list = new ArrayList<>();

        S_list.add(0, student1 );
        S_list.add(1, student2 );
        S_list.add(2, student3 );
        S_list.add(3, student4 );
        S_list.add(4, student5 );

        Collections.sort(S_list) ;



        System.out.println( S_list );



    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", age=" + age +
                ", DOB='" + DOB + '\'' +
                ", roll_number=" + roll_number +
                ", standard=" + standard +
                ", subjects=" + subjects +
                ", marks=" + marks +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Student student = (Student) o;
        return roll_number == student.roll_number;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), roll_number);
    }

    @Override
    public int compareTo(Student that) {
        return this.roll_number - that.roll_number;
    }
}
