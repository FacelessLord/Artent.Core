package faceless.artent_core.functions;

@FunctionalInterface
public interface PentaFunction<A, B, C, D, F, G> {
    G accept(A a, B b, C c, D d, F f);
}
