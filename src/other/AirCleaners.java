package other;


public class AirCleaners {
    private int count;
    private String material;

    private boolean isOn;

    public AirCleaners(String material, int count) {
        this.material = material;
        this.count = count;
    }

    public void setOn(boolean isOn) {
        this.isOn = isOn;
    }
    public boolean condition(){
        return isOn;
    }

    public String allert() {
        if (isOn){return "Очистители воздуха в норме." ;}
        else {return "Очистители воздуха не работают." ;}
    }
}


