package other;

import technical.IDescribable;
import technical.Places;

public class City implements IDescribable {

    private String title;
    private String condition;

    public City (String title, String condition){
        this.title = title;
        this.condition = condition;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    @Override
    public String describe() {
        return Places.CITY + " " + title + " " + condition;
    }
}
