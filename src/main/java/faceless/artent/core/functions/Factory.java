package faceless.artent.core.functions;

@FunctionalInterface
public interface Factory<T> {
    T create();
}
