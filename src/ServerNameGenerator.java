import java.util.Random;

public class ServerNameGenerator {

//    int random = (int) Math.floor(Math.random() * (10 - 1)) + 1;

    public static String output (String[] arrayString) {
        Random random = new Random();
        int index = random.nextInt(arrayString.length);
        return arrayString[index];
    }


    public static void main (String[] args) {
        String[] adj = new String[] {"jagged","unwieldy", "threatening", "unkempt","wiry","elegant","scary","ragged","quick","voracious"};

        String[] noun = new String[] {"restaurant","coffee","paycheck","art","books","independence","charity","energy","disaster","theory","method"};

        System.out.println("here is your server name: \n" + output(adj) + " "+ output(noun));
    }

}
