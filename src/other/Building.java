package other;


import technical.IDescribable;

public class Building implements IDescribable {
    private boolean gravity;
    private String location;
    private String title;
    private String color;
    private String shape;
    private String size;

    public Building (String location, String title, String color, String shape, String size, boolean gravity){
        this.gravity = gravity;
        this.location = location;
        this.title = title;
        this.shape = shape;
        this.size = size;
        this.color = color;
    }



    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getColor() {
        return color;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getShape() {
        return shape;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }


    public void setLocation(String whereIsNow, String location) {
//        Where.setPlace(location, whereIsNow);
        this.location = location;
    }

    public String getLocation() {
        return location;
    }


    @Override
    public String describe() {
        return getSize() + " " + getColor() + " " + "здание " + getShape() + " - " + getTitle() + " " + "выросло " + getLocation();
    }

}
