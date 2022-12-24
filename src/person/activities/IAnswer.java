package person.activities;

import technical.PartsOfRocket;

public interface IAnswer { //нейминги + разбораться с дефолтной реализацией
    default void Answer(PartsOfRocket part, String whoDoIt) {
        System.out.print(whoDoIt + "отвечает - ");
        if (part == PartsOfRocket.FANS) {
            System.out.println("В вентиляции помещения.");
        }
        if (part == PartsOfRocket.AIR_CLEANERS) {
            System.out.println("В очистке воздуха.");
        }
        if (part == PartsOfRocket.THERMOSTATS) {
            System.out.println("В поддержании нужной температуры.");
        }
        if (part == PartsOfRocket.BYTECODE) {
            System.out.println("Господи спаси! Господи спаси! Господи спаси! Господи спаси! Господи спаси!");
        }
    }
}
