package util;

public class InputTest {
    public static void main(String[] args) {
Input Input = new Input();

        System.out.println(Input.getString());
        System.out.println(Input.yesNo());
        System.out.println(Input.getInt(1, 10));
        System.out.println(Input.getInt());
        System.out.println(Input.getDouble(13.47f, 86.32f));
        System.out.println(Input.getDouble());

    }
}