package codingSection10;

public class Generics {


    // We use < > to specify Parameter type
    static class Test<T, U>
    {
        T obj1;  // An object of type T
        U obj2;  // An object of type U

        Test(T obj1, U obj2)
        {
            this.obj1 = obj1;
            this.obj2 = obj2;
        }

        // To print objects of T and U
        public void print()
        {
            System.out.println(obj1);
            System.out.println(obj2);
        }
    }


        public static void main (String[] args)
        {
            Test <String, Integer> obj =
                    new Test<String, Integer>("GfG", 15);

            obj.print();
    }
}
