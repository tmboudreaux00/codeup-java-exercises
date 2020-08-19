import java.util.Arrays;

public class ArraysExercises {
    public static void main(String[] args){
//        int[] numbers = {1, 2, 3, 4, 5};
//        String numToString = Arrays.toString(numbers); //must convert toString to view array contents
//        System.out.println(numToString);
//
//        int[] numCopy = Arrays.copyOf(numbers, 10);
//        String numCopyToString = Arrays.toString(numCopy);
//        System.out.println(numCopyToString);
        String[][] Stooges = {
                {""},
                {""},
                {""}
        };
        String[] StoogePool = {"Larry", "Curly", "Moe", "Shemp"};
        for (int i = 0; i < Stooges.length; i++){
            if (Stooges[0] == ""){
                Person larry = new Person();
                larry.setName("Larry");
                larry.sayHello();
                Stooges[0] = null;

            } else if (Stooges[1] == "") {
                Person curly = new Person();
                curly.setName("Curly");
                curly.sayHello();
            } else if (Stooges[2] == "") {
                for (int j = 0; j < Stooges[i].length; j++) {
                    if (Stooges[2][0] == "") {
                        Person moe = new Person();
                        moe.setName("Moe");
                        moe.sayHello();
                    } else if (Stooges[2][1] == "") {
                        Person shemp = new Person();
                        shemp.setName("Shemp");
                        shemp.sayHello();
                    }
                }

            }
        }
//        String StoogesString = Arrays.toString(stooge);
//        System.out.println(StoogesString);
    }
}
