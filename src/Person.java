
public class Person {
    private String name;

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public Person(String name){
        this.name = name;
    }

    public String sayHello(){
        return ("Nyuk nyuk nyuk! I am " + name);
    }

    public static void main (String[] args) {
        Person cletus = new Person("Cletus");
        cletus.setName("Cletus");
        cletus.sayHello();
    }

}
