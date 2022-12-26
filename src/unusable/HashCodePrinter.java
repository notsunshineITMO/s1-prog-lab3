package unusable;

import java.util.function.Consumer;

public class HashCodePrinter<T> implements Consumer<T> {
    @Override
    public void accept(T t) {
        System.out.println(t.hashCode());
    }
}
