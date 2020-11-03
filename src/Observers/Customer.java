package Observers;

public class Customer implements Observer {
    private String name;
public Customer(String name)
{
    this.name=name;
}


    @Override
    public void update(String msg) {
        System.out.printf(" %s has a new notification %s %n", name , msg);
    }
}
