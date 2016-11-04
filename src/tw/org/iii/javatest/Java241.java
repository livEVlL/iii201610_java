package tw.org.iii.javatest;

public class Java241 {
    public static void main(String[] args) {
        Person obj1 = new Person("AB");
        Person obj2 = new Person("CD");
        Person obj3 = new Person("EF");
        obj1.sayYa();
        System.out.println(Person.getCounter());
    }
}
class Person{
        String name;
        static private int counter;
        Person(String name){
            this.name = name;
            counter++;
        }
         void sayYa() {
            System.out.println(name +":YA");
        }
        static int getCounter(){
            return counter;
        }
    }
