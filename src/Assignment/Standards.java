package Assignment;


public class Standards {

    private ClassName className;
    private Sections section;
    private int strength;


    public Standards(ClassName className, Sections section, int strength) {
        this.className = className;
        this.section = section;
        this.strength = strength;


    }

    static Standards sample_class1 = new Standards (ClassName.firstClass , Sections.A , 25 );
    static Standards sample_class2 = new Standards (ClassName.secondClass , Sections.B , 18 );
    static Standards sample_class3 = new Standards (ClassName.thirdClass , Sections.C , 32 );
    static Standards sample_class4 = new Standards (ClassName.fourthClass , Sections.D , 28 );
    static Standards sample_class5 = new Standards (ClassName.fifthClass , Sections.E , 16 );

    @Override
    public String toString() {
        return "Standards{" +
                "className=" + className +
                ", section=" + section +
                ", strength=" + strength +
                '}';
    }
}
