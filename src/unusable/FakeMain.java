package unusable;

import java.util.function.Consumer;

public class FakeMain {
    public static void main(String[] args){

        Consumer<String> cons = FakeMain::printer;

        cons.accept("m?");

    }
    public static <T> void printer(T t){
        System.out.println("m?" + t + "m?");
    }
}
