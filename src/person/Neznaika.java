package person;

import person.activities.Flyable;
import technical.*;
import person.activities.Ask;

public class Neznaika extends Person implements Describable, Ask, Flyable {
    private String location;
    private Where where = new Where();

    public Neznaika(String name) {
        super(name);
    }


    public void setLocation(String whereExactly, String location) {
        where.setPlace(whereExactly,location);
        this.location = where.getPlace();
    }
    public String getLocation() {
        return location;
    }


    public void Waits(String whatTime){
        System.out.println(name + " подождал " + whatTime);
    }


    @Override
    public void Ask(PartsOfRocket part) {
        final double RANDOMIZE_COEF = Math.random() * 100;
        if (RANDOMIZE_COEF <= 50){System.out.print("Незнайка интересуется: ");}
        else {System.out.print("Незнайка спрашивает: ");}
        String question = "В чём идея ";
        System.out.println(question + part + "?");
    }

    @Override
    public String Fly() {
        if (getLocation().equals("IN PAVILION_OF_ZERO_GRAVITY ")){
            return getName() + "летает";
        }
        return null;
    }

    @Override
    public String describe(){
        return getName() + "находился " + getLocation();
    }
}

