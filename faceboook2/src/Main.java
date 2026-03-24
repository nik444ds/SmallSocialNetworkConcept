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
    public static final String CMD_LIST_FRIENDS = "FRIENDS";
    public static final String CMD_LIST_USER = "USERS";
    public static final String CMD_NEW_STATUS = "NEWSTATUS";
    public static final String CMD_CHECK_STATUS = "CHECKSTATUS";

//Answers for User
public static final String ALREADY_REGISTERED = "Already registered.";
public static final String REGISTER_SUCCESS = "Successfully registered.";
public static final String NOT_REG ="Not registered.";
public static final String FRIEND_ADDED = "Friendship created.";
public static final String ALREADY_FRIENDS = "Friendship already exists.";
public static final String NOT_FRIENDSHIP = "Invalid friendship.";
public static final String NOT_FRIENDSHIP_EXIST = "Non-existent friendship.";
public static final String NOT_REGISTERED_FRIEND = "No registered friends.";
public static final String FRIENDS_LIST = "Friends list:";
public static final String STATUS_CHANGED = "Status updated.";
public static final String NOT_REGISTERED_USERS = "Empty social network.";
public static final String LIST_OF_USERS = "List of registered users:";

    // class orkut
    static OrkutNetworkClass ork = new OrkutNetworkClass();

    private static String getCommand(Scanner in){
    String input;
    input = in.nextLine().toUpperCase();
    return input;
}

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String command = getCommand(in).toUpperCase();
        while (!command.equals(CMD_QUIT)) {
            switch (command.toUpperCase()) {
                case CMD_REGISTERED -> getRegistered(in);
                case CMD_REGISTER -> setRegister(in);
                case CMD_CHECK_FRIENDSHIP -> checkingFriendShip(in);
                case CMD_ADD_FRIEND -> addFriendship(in);
                case CMD_LIST_FRIENDS -> listFriends(in);
                case CMD_CHECK_STATUS -> checkStatus(in);
                case CMD_NEW_STATUS -> newStatus(in);
                case CMD_LIST_USER ->  listUsers(in);



                default -> System.out.println(CMD_ERROR);
            }
            command = getCommand(in);
        }

        System.out.println("Bye.");
        in.close();
    }


    private static void getRegistered(Scanner in){
        String registeredGuy = in.nextLine();
        if(ork.hasPerson(registeredGuy)){
            System.out.println(ALREADY_REGISTERED);
        }else{
            System.out.println(NOT_REG);
        }


    }
    private static void setRegister(Scanner in){
       String name = in.nextLine();
        String email = in.nextLine();
       String status = in.nextLine();

        if(ork.hasPerson(name)){
            System.out.println(ALREADY_REGISTERED);
        }
        else{
            ork.addPerson(name, email, status);
            System.out.println(REGISTER_SUCCESS);
        }


    }
    private static void addFriendship(Scanner in){
       String user1 = in.nextLine();
       String user2 = in.nextLine();
       if(!ork.hasPerson(user1) || !ork.hasPerson(user2)){
           System.out.println(NOT_REG);
       }
       else if(user2.equals(user1)){
           System.out.println(NOT_FRIENDSHIP);
       }
       else if(ork.checkFriendship(user1,user2)){
           System.out.println(ALREADY_FRIENDS);
       }

       else{
           ork.addFriendship(user1, user2);
           System.out.println(FRIEND_ADDED);
       }

    }
    private static void checkingFriendShip(Scanner in){
        String name1 = in.nextLine();
        String name2 = in.nextLine();
        if(ork.checkFriendship(name1, name2)){
            System.out.println(ALREADY_FRIENDS);
        }
        else{
            System.out.println(NOT_FRIENDSHIP_EXIST);
        }

    }
    private static void listFriends(Scanner in){
        String name = in.nextLine();
        PersonIterator personIt = ork.listFriends(name);
        if(!ork.hasPerson(name)){
            System.out.println(NOT_REG);
        }
        else if(!ork.hasFriendship(name)){
            System.out.println(NOT_REGISTERED_FRIEND);
        }
        else{
            personIt.init();
            System.out.println(FRIENDS_LIST);

            while(personIt.hasNext()){
               Person friendly = personIt.next();
                System.out.println(friendly.getName() + "; " + friendly.getEmail());

            }
        }

    }
    private static void checkStatus(Scanner in){
    String name = in.nextLine();
    if(!ork.hasPerson(name)){
        System.out.println(NOT_REG);
    }
    else{
        System.out.println(ork.getPersonStatus(name));
    }
    }
    private static void newStatus(Scanner in){
        String name = in.nextLine();
        String newStatus = in.nextLine();
        if(!ork.hasPerson(name)){
            System.out.println(NOT_REG);
        }
        else{
            ork.updateStatus(name,  newStatus);
            System.out.println(STATUS_CHANGED);
        }
    }
    private static void listUsers(Scanner in){
        PersonIterator personI = ork.listUsers();
        if(!ork.hasUsers()){
            System.out.println(NOT_REGISTERED_USERS);
        }
        else {
            personI.init();
            System.out.println(LIST_OF_USERS);
            while (personI.hasNext()) {
                Person p = personI.next();
                System.out.println(p.getName() + "; " + p.getEmail());
            }
        }
    }
}