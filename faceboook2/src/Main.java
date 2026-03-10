import java.util.Scanner;
/**Nicolas Nº74517
 *
 */
public class Main {
    // Comands from user
    public static final String REGISTERED = ("REGISTERED");



    // Outputs for commands
    public static final String ALREADY_REG = ("Already registered.");
    public static final String NOT_REG = ("Not registered.");


private static String getCommand(Scanner in){
    String input;
    input = in.nextLine().toUpperCase();
    return input;
}

    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    String command;{
        case REGISTERED -> getRegistered(in, );
        }

    do{
        command = getCommand(in);
        switch(command)
    }


    }

    private static void getRegistered(Scanner in, String registeredGuy){

    }
}