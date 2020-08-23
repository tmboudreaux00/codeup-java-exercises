import java.util.Arrays;

public class ArraysExercises{

    public static void main(String[] args) {
        Person[] stooges = new Person[3];
        stooges[0] = new Person("Larry");
        stooges[1] = new Person("Curly");
        stooges[2] = new Person("Moe");

        for(Person thisPerson: stooges) {
            System.out.println(thisPerson.sayHello());
        }

        Person shemp = new Person("Shemp");
        Person[] updatedStooges = new Person[stooges.length + 1];
        updatedStooges = addPerson(stooges, shemp);

        for(Person thisPerson : updatedStooges){
            System.out.println(thisPerson.getName());
        }
    }
    public static Person[] addPerson(Person[] existingPeople, Person newPeep){
        Person[] updatedPeeps = Arrays.copyOf(existingPeople, existingPeople.length + 1);
        updatedPeeps[existingPeople.length] = newPeep;
        return updatedPeeps;
    }
}
