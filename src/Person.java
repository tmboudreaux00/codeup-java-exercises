
public class Person {
    private String name = "John Doe";

    public String getName() {
//TODO: return the person's name
        return name;
    }

    public void setName(String name) {
//TODO: change the name property to the passed value
        this.name = name;
    }

    public void sayHello() {
//TODO: print a message to the console using the person's name
        if (name.toLowerCase() == "larry") {
            System.out.println("Ooo, a wise guy, eh?");
        }
        else if (name.toLowerCase() == "curly"){
            System.out.println("nyuk nyuk nyuk");
        }
        else if (name.toLowerCase() == "moe"){
            System.out.println("What's the matter with you?");
        }
        else if (name.toLowerCase() == "shemp"){
            System.out.println("eeeb! eeeb! eeeb! eeeb!");
        } else {
            System.out.println("We're gettin' no place fast! Try again.");
        }
    }

    public static void main(String[] args) {
        Person cletus = new Person();
        cletus.setName("Cletus");
        cletus.sayHello();
    }
}


