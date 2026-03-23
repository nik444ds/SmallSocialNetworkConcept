package orkutNetwork;
public class PersonClass implements Person {
    String email;
    String name;
    String status;
    Person[] friends;
    int counter;


    public PersonClass(String name, String email, String status){
        this.email = email;
        this.name = name;
        this.status = status;
        this.friends = new Person[50];
       this.counter = 0;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getState() {
        return status;
    }

    @Override
    public String getEmail() {
        return email;
    }

    public void setStatus(String newStatus){
       status = newStatus;
    }
    public boolean areFriend(String friendUser){
        for(int i = 0; i < counter; i++){
            if(friendUser.equals(friends[i].getName())){
                return true;
            }
        }
        return false;
    }

    @Override
    public Person[] listOfFriends() {
        return friends;
    }

    @Override
    public int friendsCounter() {
        return counter;
    }


    @Override
    public boolean hasFriend() {
       return counter > 0;
    }

    @Override
    public void addFriend(Person person) {
        friends[counter] = person;
        counter++;
    }
}