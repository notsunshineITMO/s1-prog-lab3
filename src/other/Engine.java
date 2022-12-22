package other;

public class Engine {
    private String material;
    private boolean isOn;
    private double version;

    public Engine (String material, double version) {
        this.material = material;
        this.version = version;
    }

    public void setOn(boolean isOn) {
        this.isOn = isOn;
    }

    public boolean condition(){
        return isOn;
    }

    public String allert() {
        if (isOn){return "Двигатель в норме." ;}
        else {return "Двигатель не работает." ;}
    }
}
