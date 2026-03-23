package orkutNetwork;
public interface Person {

  String getName();

  String getState();

  String getEmail();

  boolean hasFriend();

  void addFriend(Person person);

  void setStatus(String newFriend);

  boolean areFriend(String friendUser);

Person[] listOfFriends();
int friendsCounter();

}
