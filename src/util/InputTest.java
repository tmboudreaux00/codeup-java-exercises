package util;

public class InputTest {
    public static void main(String[] args){
        Input newLine = new Input();
        newLine.getString();
        newLine.yesNo();
        newLine.getInt(1, 100);
        newLine.getDouble(1, 100);
    }
}
