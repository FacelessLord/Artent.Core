package faceless.artent_core.functions;

@FunctionalInterface
public interface Factory<T> {
    T create();
}
