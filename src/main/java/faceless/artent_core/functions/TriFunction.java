package faceless.artent_core.functions;

@FunctionalInterface
public interface TriFunction<A, B, C, D> {
    D accept(A a, B b, C c);
}

