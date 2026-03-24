import java.util.Scanner;
import orkutNetwork.*;
/**Nicolas
 * Work from University
 *
 */
public class Main {
    // Commands from user
    public static final String CMD_REGISTERED ="REGISTERED";
    public static final String CMD_REGISTER = "REGISTER";
    public static final String CMD_ERROR = "UNKNOWN COMMAND";
    public static final String CMD_QUIT = "QUIT";
    public static final String CMD_CHECK_FRIENDSHIP = "CHECKFRIENDSHIP";
    public static final String CMD_ADD_FRIEND = "ADDFRIEND";

//Answers for User
public static final String ALREADY_REGISTERED = "Already registered.";
public static final String REGISTER_SUCCESS = "Successfully registered.";
public static final String NOT_REG ="Not registered.";
public static final String FRIENDSHIP_EXISTS = "Friendship already exists.";
public static final String FRIENDSHIP_NOT_EXISTS = "Non-existent friendship.";
public static final String FRIEND_ADDED = "Friendship created.";
public static final String ALREADY_FRIENDS = "Friendship already exists.";
public static final String NOT_FRIENDSHIP = "Invalid friendship.";
    // class orkut
    static OrkutNetworkClass ork = new OrkutNetworkClass();

    private static String getCommand(Scanner in){
    String input;
    input = in.nextLine().toUpperCase();
    return input;
}

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String reg ="";
        String command = getCommand(in).toUpperCase();
        while (!command.equals(CMD_QUIT)) {
            switch (command.toUpperCase()) {
                case CMD_REGISTERED -> getRegistered(in, reg);
                case CMD_REGISTER -> setRegister(in, reg,reg,reg);
                case CMD_CHECK_FRIENDSHIP -> checkingFriendShip(in, reg, reg);
                case CMD_ADD_FRIEND -> addFriendship(in, reg,reg);



                default -> System.out.println(CMD_ERROR);
            }
            command = in.nextLine();
        }

        System.out.println("Bye!");
        in.close();
    }


    private static void getRegistered(Scanner in, String registeredGuy){
        registeredGuy = in.nextLine();
        ork.hasPerson(registeredGuy);
        if(ork.hasPerson(registeredGuy)){
            System.out.println(ALREADY_REGISTERED);
        }else{
            System.out.println(NOT_REG);
        }


    }
    private static void setRegister(Scanner in, String name, String email, String status){
        name = in.nextLine();
        email = in.nextLine();
        status = in.nextLine();

        if(ork.hasPerson(name)){
            System.out.println(ALREADY_REGISTERED);
        }
        else{
            ork.addPerson(name, email, status);
            System.out.println(REGISTER_SUCCESS);
        }


    }
    private static void addFriendship(Scanner in, String user1, String user2){
        user1 = in.nextLine();
        user2 = in.nextLine();
        if(ork.hasPerson(user1) && ork.hasPerson(user2)){
            if()
        }

    }
    private static void checkingFriendShip(Scanner in,String name1, String name2){
        name1 = in.nextLine();
        name2 = in.nextLine();
        if()
    }
}