package orkutNetwork;
public class OrkutNetworkClass implements OrkutNetwork {
Person[] users;
int counter;

public OrkutNetworkClass(){
    this.users = new Person[500];
    this.counter = 0;
}
    @Override
    public boolean hasPerson(String existPerson) {
     for(int i = 0; i < counter;i++){
         if(existPerson.equals(users[i].getName()))
         return true;
     }
        return false;
    }

    @Override
    public void addPerson(String name, String email, String status) {
        PersonClass personClass = new PersonClass(name, email, status);
        users[counter] = personClass;
        counter++;
    }

    @Override
    public boolean checkFriendship(String firstUser, String friendUser) {
        for(int i =0; i < counter; i++){
            if(firstUser.equals(users[i].getName())){
               return  users[i].areFriend(friendUser);
            }
        }
        return false;
    }

    @Override
    public void addFriendship(String name1, String name2) {
        for(int i =0; i < counter; i++){
            if(name1.equals(users[i].getName())){
                for(int j = 0; j < counter;j++){
                    if(name2.equals(users[j].getName())){
                         users[i].addFriend(users[j]);
                         users[j].addFriend(users[i]);
                    }
                }
            }
        }
    }

    @Override
    public PersonIterator listFriends(String name) {
    for(int i = 0; i < counter; i++){
        if(name.equals(users[i].getName())){
           PersonIteratorClass personIteratorClass = new PersonIteratorClass(users[i].listOfFriends(),users[i].friendsCounter());

            return personIteratorClass;
        }
    }
        return null;
    }

    @Override
    public void updateStatus(String name, String newStatus) {
        for(int i = 0; i < counter; i++){
            if(name.equals(users[i].getName())){
                 users[i].setStatus(newStatus);
            }
        }
    }

    @Override
    public String getPersonStatus(String name) {

    for(int i = 0; i < counter; i++){
        if(name.equals((users[i]).getName())){
            return users[i].getState();
        }

    }
    return null;
    }

    @Override
    public PersonIterator listUsers() {
        return new PersonIteratorClass(users, counter);
    }
}
