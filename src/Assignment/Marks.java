package Assignment;


import java.util.*;

public class Marks {
        Integer marks;
        Subject subject;

        public Marks(Integer marks, Subject subject) {
                this.marks = marks;
                this.subject = subject;
        }

//        static void AddMarks() {
//
//                Map<Subject, Integer> m1 = new HashMap();
//
//
//                m1.put(Subject.Drawing, 95);
//                m1.put(Subject.Science, 63);
//                m1.put(Subject.Mathematics, 78);
//                m1.put(Subject.Social_Studies, 48);
//                m1.put(Subject.English, 98);
//
//                Map<Subject, Integer> m2 = new HashMap();
//
//
//                m2.put(Subject.Drawing, 56);
//                m2.put(Subject.Science, 48);
//                m2.put(Subject.Mathematics, 64);
//                m2.put(Subject.Social_Studies, 65);
//                m2.put(Subject.English, 62);
//
//                Map<Subject, Integer> m3 = new HashMap();
//
//
//                m3.put(Subject.Drawing, 97);
//                m3.put(Subject.Science, 53);
//                m3.put(Subject.Mathematics, 62);
//                m3.put(Subject.Social_Studies, 46);
//                m3.put(Subject.English, 59);
//
//                Map<Subject, Integer> m4 = new HashMap();
//
//
//                m4.put(Subject.Drawing, 84);
//                m4.put(Subject.Science, 57);
//                m4.put(Subject.Mathematics, 75);
//                m4.put(Subject.Social_Studies, 76);
//                m4.put(Subject.English, 19);
//
//                Map<Subject, Integer> m5 = new HashMap();
//
//
//                m5.put(Subject.Drawing, 37);
//                m5.put(Subject.Science, 49);
//                m5.put(Subject.Mathematics, 91);
//                m5.put(Subject.Social_Studies, 34);
//                m5.put(Subject.English, 65);


//   static Marks m1 = new Marks(Subject.Drawing , 65);
//   static Marks m2 = new Marks(Subject.Science , 45);
//   static Marks m3 = new Marks(Subject.Mathematics , 78);
//   static Marks m4 = new Marks(Subject.Social_Studies , 48);
//   static Marks m5 = new Marks(Subject.English , 98);

        static Map One() {

                Map<Subject, Integer> m1 = new HashMap();


                m1.put(Subject.Drawing, 95);
                m1.put(Subject.Science, 63);
                m1.put(Subject.Mathematics, 78);
                m1.put(Subject.Social_Studies, 48);
                m1.put(Subject.English, 98);

                float sum =0.0f;
                for(float f : m1.values()){
                        sum +=f;
                }

                return m1;
        }

        static Map Two() {

                Map<Subject, Integer> m2 = new HashMap();


                m2.put(Subject.Drawing, 56);
                m2.put(Subject.Science, 48);
                m2.put(Subject.Mathematics, 64);
                m2.put(Subject.Social_Studies, 65);
                m2.put(Subject.English, 62);


                float sum =0.0f;
                for(float f : m2.values()){
                        sum +=f;
                }

                return m2;
        }
        static Map Three() {

                Map<Subject, Integer> m3 = new HashMap();

                m3.put(Subject.Drawing, 97);
                m3.put(Subject.Science, 53);
                m3.put(Subject.Mathematics, 62);
                m3.put(Subject.Social_Studies, 46);
                m3.put(Subject.English, 59);

                float sum =0.0f;
                for(float f : m3.values()){
                        sum +=f;
                }

                return m3;
        }
        static Map Four() {

                Map<Subject, Integer> m4 = new HashMap();

                m4.put(Subject.Drawing, 84);
                m4.put(Subject.Science, 57);
                m4.put(Subject.Mathematics, 75);
                m4.put(Subject.Social_Studies, 76);
                m4.put(Subject.English, 19);

                float sum =0.0f;
                for(float f : m4.values()){
                        sum +=f;
                }

                return m4;
        }
        static Map Five() {

                Map<Subject, Integer> m5 = new HashMap();


                m5.put(Subject.Drawing, 37);
                m5.put(Subject.Science, 49);
                m5.put(Subject.Mathematics, 91);
                m5.put(Subject.Social_Studies, 34);
                m5.put(Subject.English, 65);

                float sum =0.0f;
                for(float f : m5.values()){
                        sum +=f;
                }

                return m5;
        }


}
