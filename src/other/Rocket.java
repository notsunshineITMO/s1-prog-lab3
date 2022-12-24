package other;

import technical.PartsOfRocket;
import technical.Places;

public class Rocket {
    private final CabineOfControl cabineOfControl;
    private final Engine engine;
    private final Fans fans;
    private final Thermostats thermostats;
    private final AirCleaners airCleaners;
    private static final byte maxLevelOfArmored = 3;

    public Rocket(Engine engine, Fans fans, Thermostats thermostats, AirCleaners airCleaners, CabineOfControl cabineOfControl) {
        this.engine = engine;
        this.fans = fans;
        this.thermostats = thermostats;
        this.airCleaners = airCleaners;
        this.cabineOfControl = cabineOfControl;
    }

    public void launchSystems() throws InterruptedException {
        System.out.println("Запуск всех систем...");
        Thread.sleep(1000);
        engine.setOn(true);
        fans.setOn(true);
        thermostats.setOn(true);
        airCleaners.setOn(true);
        System.out.println("Все систеы запущены.");
        Thread.sleep(500);
        System.out.println();
    }

    public void globalCheckUp() throws InterruptedException {
        System.out.println("Проверка всех систем...");
        Thread.sleep(1000);
        System.out.println(engine.allert());
        Thread.sleep(250);
        System.out.println(fans.allert());
        Thread.sleep(250);
        System.out.println(thermostats.allert());
        Thread.sleep(250);
        System.out.println(airCleaners.allert());
        Thread.sleep(250);
        if (engine.condition() && fans.condition() && thermostats.condition() && airCleaners.condition()) {
            System.out.println("Все системы в норме. Проверка прошла успешна!");
        } else {
            System.out.println("Сбой в одной из систем. Проверка не пройдена!!!");
        }
    }

    public static void Notice(String name, String inout) {
        if (inout.equals("in")) {
            System.out.println(name + "зашёл в ракету. ");
        }
        if (inout.equals("out")) {
            System.out.println(name + "вышел из ракеты. ");
        }
    }


    public byte getLevelOfArmored(PartsOfRocket part) {
        byte levelOfArmored;
        if (part == PartsOfRocket.CABINE_OF_CONTROL) {
            return levelOfArmored = 3;
        }
        else {
            return levelOfArmored = 2;
        }
    }
}
