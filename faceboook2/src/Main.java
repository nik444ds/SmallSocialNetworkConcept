import java.util.Scanner;
import orkutNetwork.*;
/**Nicolas Nº74517
 *
 */
public class Main {
    // Comands from user
    public static final String CMD_REGISTERED ="REGISTERED";
    public static final String CMD_
    public static final String CMD_ERROR = "UNKNOWN COMMAND";
    public static final String CMD_QUIT = "QUIT";



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
        String command = in.nextLine();
        while (!command.equals(CMD_QUIT)) {
            switch (command) {
                case CMD_REGISTERED -> getRegistered(in, );


                default System.out.println(CMD_ERROR);
            }
        }
    }


    private static void getRegistered(Scanner in, String registeredGuy){

    }
}