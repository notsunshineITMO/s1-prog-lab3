package person;

import person.activities.IAnswer;
import person.activities.IWatchingFor;
import technical.IDescribable;
import technical.PartsOfRocket;
import technical.Where;

public class Fuchsia extends Person implements IDescribable, IAnswer, IWatchingFor {
    private String location;
    private Where where = new Where();

    public Fuchsia (String name){
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
        System.out.println(getName() + "ведёт наблюдение за " + part);
    }

    @Override
    public String describe(){
        return getName() + "находилась " + getLocation();
    }
}
