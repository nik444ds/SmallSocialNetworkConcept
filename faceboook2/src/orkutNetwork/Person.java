package orkutNetwork;
public interface Person {

  String getName();

  String getState();

  String getEmail();

  boolean hasFriend();

  void addFriend(String name);
}
