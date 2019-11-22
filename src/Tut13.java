class PersonSample {
    String name;
    int age;
}


public class Tut13 {
    public static void main(String[] args) {

        PersonSample person1 = new PersonSample();
        person1.name = "Joe Bloggs";
        person1.age = 37;

        PersonSample person2 = new PersonSample();
        person2.name = "Sarah Smith";
        person2.age = 20;

        System.out.println(person1.name);
    }
}
