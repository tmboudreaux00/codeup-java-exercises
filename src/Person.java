
public class Person {
    private String name = "John Doe";


    public String getName() {
//TODO: return the person's name
        return name;
    }

    public class setName(String name) {
//TODO: change the name property to the passed value
        this.name = name;
    }

    public Person(String name) {
        this.name = name;
    }

    public void sayHello() {
//TODO: print a message to the console using the person's name
        System.out.printf("Howdy, %s", getName());
    }

    public static void main(String[] args) {
        Person cletus = new Person("Cletus\n");
        cletus.sayHello();
//        Person person1 = new Person("John");
//        Person person2 = new Person("Jane");
//        System.out.println(person1.getName().equals(person2.getName()));
//        System.out.println(person1 == person2);

    }


}


