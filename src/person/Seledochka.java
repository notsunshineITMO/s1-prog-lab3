package person;

import person.activities.IAnswer;
import person.activities.ISay;
import person.activities.IWatchingFor;
import technical.*;

public class Seledochka extends Person implements IDescribable, IAnswer, IWatchingFor, ISay {
    private String location;
    private Where where = new Where();
    public Seledochka (String name){
        super(name);
    }

    public void setLocation(String whereExactly, String location) {
        where.setPlace(whereExactly,location);
        this.location = where.getPlace();
    }

    public String getLocation() {
        return location;
    }

    @Override
    public void watchFor(PartsOfRocket part) {
        System.out.println(getName() + "наблюдает за " + part);
    }

    @Override
    public String SayAbout(String personName) {
        if (personName.equals("neznaika")){
        return "Никого прогонять не надо: если кто-нибудь хочет как следует изучить устройство ракеты, то от этого может быть только польза.";
        }
        if (personName.equals("fuchsia")){
            return "Фуксия ведёт наблюдение за термостатами!";
        }
        if (personName.equals("visitors")){
            return "Мы всегда рады новым посетителям!";
        }
        else {return "Даже не знаю, что и сказать...";}
    }

    @Override
    public String describe(){
        return getName() + "находилась " + getLocation();
    }

}
