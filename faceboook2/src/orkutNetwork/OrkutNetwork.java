package orkutNetwork;
public interface OrkutNetwork {


    //Verify if the people exist
    boolean hasPerson(String exist);

   // add a new user in to network
     void addPerson(String name, String email, String status);

   // Check if two users are friends
    boolean checkFriendship(String firstUser, String friendUser);

   //Add a new friendship
     void addFriendship(String name1, String name2);

     //List of friends from one user
     PersonIterator listFriends(String name);

     // Update the status from user
     void updateStatus(String name, String newStatus);

   // Shows the status from user
     String getPersonStatus(String name);

     // list all users in network
     PersonIterator listUsers();

     boolean hasFriendship(String name);

     boolean hasUsers();
}
