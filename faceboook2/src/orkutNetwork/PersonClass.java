package orkutNetwork;
public class PersonClass implements Person {
    String email;
    String name;
    String status;
    friends Person[];

    @Override
    public String getName() {
        return "";
    }

    @Override
    public String getState() {
        return "";
    }

    @Override
    public String getEmail() {
        return "";
    }

    @Override
    public boolean hasFriend() {
        return false;
    }

    @Override
    public void addFriend(String name) {

    }
}
