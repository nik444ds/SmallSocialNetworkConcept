package orkutNetwork;
public class PersonIteratorClass implements PersonIterator {
    private  Person[] person;
    private int counter;
    private int current;

    public PersonIteratorClass(Person[] person, int counter){
        this.person = person;
        this.counter = counter;
        this.current = 0;
    }

    @Override
    public void init() {
        current = 0;
    }
    @Override
    public boolean hasNext() {
        return current < counter;
    }

    @Override
    public Person next() {
        return person[current++];
    }


}
