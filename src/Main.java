import other.*;
import person.*;
import technical.PartsOfRocket;
import technical.Places;


public class Main {

    public void func() {

    }
    Object

    public static void main(String[] args) throws InterruptedException {
        String pl_rocket = Places.ROCKET.toString();
        String pl_building = Places.PAVILION_OF_ZERO_GRAVITY.toString();
        String pl_city = Places.CITY.toString();
        String pl_in = Places.IN.toString();
        String pl_near = Places.NEAR.toString();

        Neznaika neznaika = new Neznaika("Незнайка");
        Fuchsia fuchsia = new Fuchsia("Фуксия");
        Seledochka seledochka = new Seledochka("Селёдочка");
        Visitors visitors = new Visitors("посетители",48);

        Building pavilionNevesomosti = new Building(Places.CITY.toString(), "Павильон невесомости", "Белое", "в форме перевернутой миски", "Большое", true );
        City kosmicheskiy = new City("Космический", "существует");

        Engine engine = new Engine("steel", 1.25);
        Fans fans = new Fans("steel", 23);
        Thermostats thermostats = new Thermostats("steel", 8);
        AirCleaners airCleaners = new AirCleaners("steel", 14);
        CabineOfControl cabineOfControl = new CabineOfControl((byte) 3);

        Rocket rocket = new Rocket(engine, fans, thermostats, airCleaners, cabineOfControl);




        rocket.launchSystems();
        rocket.globalCheckUp();
        System.out.println();
        Thread.sleep(1500);

        fuchsia.setLocation(pl_in, pl_rocket);
        seledochka.setLocation(pl_in, pl_rocket);
        System.out.println(seledochka.describe() + "и " + fuchsia.describe());
        visitors.setLocation(pl_in, pl_rocket);
        neznaika.setLocation(pl_in, pl_rocket);
        Rocket.Notice(neznaika.getName(),"pl_in");
        Rocket.Notice(visitors.getName(), "pl_in");
        System.out.println(neznaika.describe());
        System.out.println(visitors.describe());

        seledochka.watchFor(PartsOfRocket.FANS);
        fuchsia.watchFor(PartsOfRocket.AIR_CLEANERS);

        visitors.Ask(PartsOfRocket.FANS);
        fuchsia.Answer(PartsOfRocket.FANS, fuchsia.getName());
        neznaika.Ask(PartsOfRocket.AIR_CLEANERS);
        seledochka.Answer(PartsOfRocket.AIR_CLEANERS, seledochka.getName());
        visitors.Ask(PartsOfRocket.THERMOSTATS);
        fuchsia.Answer(PartsOfRocket.THERMOSTATS, fuchsia.getName());
        fuchsia.watchFor(PartsOfRocket.THERMOSTATS);
        seledochka.watchFor(PartsOfRocket.THERMOSTATS);
        neznaika.Ask(PartsOfRocket.BYTECODE);
        seledochka.Answer(PartsOfRocket.BYTECODE, seledochka.getName());
        Rocket.Notice(neznaika.getName(),"out");
        Rocket.Notice(visitors.getName(), "out");
        System.out.println();

        neznaika.setLocation(pl_near, pl_rocket);
        visitors.setLocation(pl_near, pl_rocket);
        System.out.println(neznaika.describe() + "и " + visitors.describe());
        neznaika.Waits("какое-то время");
        Rocket.Notice(neznaika.getName(),"pl_in");
        Rocket.Notice(visitors.getName(), "pl_in");
        visitors.setLocation(pl_in, pl_rocket);
        neznaika.setLocation(pl_in, pl_rocket);
        System.out.println(visitors.describe() + "и " + neznaika.describe());
        System.out.println("В течение дня " + neznaika.getName() + "несколько раз побывал в ракете. ");
        System.out.println();

        System.out.println(kosmicheskiy.describe());
        pavilionNevesomosti.setLocation(pl_near, pl_city);
        System.out.println(pavilionNevesomosti.describe());

        visitors.setLocation(pl_in,pl_building);
        System.out.println(visitors.describe());
        System.out.println(visitors.Fly());
        neznaika.setLocation(pl_in,pl_building);
        System.out.println(neznaika.describe());
        System.out.println(neznaika.Fly());

    }
}