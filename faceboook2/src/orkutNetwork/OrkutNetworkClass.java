package orkutNetwork;
public class OrkutNetworkClass implements OrkutNetwork {

    @Override
    public boolean hasPerson(String exist) {
        return false;
    }

    @Override
    public void addPerson(String name, String email, String status) {

    }

    @Override
    public boolean checkFriendship(String firstUser, String friendUser) {
        return false;
    }

    @Override
    public void addFriendship(String name1, String name2) {

    }

    @Override
    public PersonIterator listFriends(String name) {
        return null;
    }

    @Override
    public void updateStatus(String name, String newStatus) {

    }

    @Override
    public String getPersonStatus(String name) {
        return "";
    }

    @Override
    public PersonIterator listUsers() {
        return null;
    }
}
