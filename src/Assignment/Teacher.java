package Assignment;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Teacher extends Person implements Comparable<Teacher> {

    private final Subject subjects;
    private final Standards standard;
    private final Boolean permanent;
    private final String designation;
    private final String d_o_j;
    private int salary;
    private int ID;

    public Teacher(String name, String address, Integer age, String DOB, Integer Id, Subject subjects, Standards standard, Boolean permanent, String designation, String d_o_j, int salary) {
        super(name, address, age, DOB, Id);
        this.subjects = subjects;
        this.standard = standard;
        this.permanent = permanent;
        this.designation = designation;
        this.d_o_j = d_o_j;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", age=" + age +
                ", DOB='" + DOB + '\'' +
                ", Id=" + Id +
                ", subjects=" + subjects +
                ", standard=" + standard +
                ", permanent=" + permanent +
                ", designation='" + designation + '\'' +
                ", d_o_j='" + d_o_j + '\'' +
                ", salary=" + salary +
                '}';
    }

    static void Speak() {
        System.out.println("This Teacher is speaking");
    }

    static Teacher teacher1 = new Teacher("joe" , "jkhadad" , 34 , "11/11/1993" , 23153154 , Subject.Mathematics , Standards.sample_class1 , true, "Professor", "11/11/11" , 140000 );

    static Teacher teacher2 = new Teacher("brenda" , "jkhadad" , 32 , "11/11/1991" , 21653154 , Subject.Science , Standards.sample_class2 , true, "Professor", "11/11/11" , 160000 );

    static Teacher teacher3 = new Teacher("rock" , "jkhadad" , 28 , "11/11/1997" , 5645654 , Subject.Social_Studies , Standards.sample_class3 , false, "Trainee", "11/11/11" , 12000 );

    static Teacher teacher4 = new Teacher("john" , "jkhadad" , 29 , "11/11/1996" , 53215254 , Subject.Drawing , Standards.sample_class4 , false, "Substitute", "11/11/11" , 11000 );

    static Teacher teacher5 = new Teacher("kevin" , "jkhadad" , 55 , "11/11/1981" , 82618321 , Subject.English , Standards.sample_class5 , true, "Head Of Department", "11/11/11" , 320000 );


    static void SortTeacher (){

        List<Teacher> T_list = new ArrayList<>();

        T_list.add(0, teacher1 );
        T_list.add(1, teacher2 );
        T_list.add(2, teacher3 );
        T_list.add(3, teacher4 );
        T_list.add(4, teacher5 );

        Collections.sort(T_list);

        System.out.println( T_list);



    }


    static void PrintTeacher(){

        List<Teacher> T_list = new ArrayList<>();

        T_list.add(0, teacher1 );
        T_list.add(1, teacher2 );
        T_list.add(2, teacher3 );
        T_list.add(3, teacher4 );
        T_list.add(4, teacher5 );

        System.out.println(T_list);
    }


     static void PrintTeacher ( int salary ){



            if (salary == teacher1.salary){
                System.out.println( teacher1 );
            }
            else if (salary == teacher2.salary){
                System.out.println(teacher2);
            }
            else if (salary == teacher3.salary){
                System.out.println(teacher3);
            }
            else if (salary == teacher4.salary){
                System.out.println(teacher4);
            }
            else if (salary == teacher5.salary){
                System.out.println(teacher5);
            }

            else {
                System.out.println("The Id is not correct");
            }
    }






    @Override
    public int compareTo(Teacher that) {
        return this.salary - that.salary ;
    }
}
