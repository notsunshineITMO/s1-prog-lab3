package other;

public class Thermostats {
    private boolean isOn;
    private String materia;
    private int count;


    public Thermostats (String material, int count) {
        this.materia = material;
        this.count = count;
    }
    

    public void setOn(boolean isOn) {
        this.isOn = isOn;
    }

    public boolean condition(){
        return isOn;
    }

    public String allert() {
        if (isOn){return "Термостаты в норме." ;}
        else {return "Термостаты не работают." ;}
    }
}
