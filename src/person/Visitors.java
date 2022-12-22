package person;

import other.Building;
import person.activities.Flyable;
import technical.*;
import person.activities.Ask;

public class Visitors extends Person implements Describable, Ask, Flyable {
    private int count;
    private String location;
    private Where where = new Where();

    public Visitors (String name, int count) {
        super(name);
        this.count = count;
    }

    public int getCount() {
        return count;
    }

    public void setLocation(String whereExactly, String location) {
        where.setPlace(whereExactly,location);
        this.location = where.getPlace();
    }

    public String getLocation() {
        return location;
    }

    @Override
    public void Ask(PartsOfRocket part) {
        System.out.print("Посетители спрашивают: ");
        String question = "В чём идея ";
        System.out.println(question + part + "?");
    }

    @Override
    public String describe(){
        return getCount() + " " + getName() + "находились " + getLocation();
    }


    @Override
    public String Fly() {
        if (getLocation().equals("IN PAVILION_OF_ZERO_GRAVITY ")){
        return getName() + "летает";
        }
        return null;
    }
}


