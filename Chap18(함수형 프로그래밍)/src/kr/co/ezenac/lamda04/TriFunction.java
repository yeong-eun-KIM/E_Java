package kr.co.ezenac.lamda04;

@FunctionalInterface
public interface TriFunction<T,U,V,R> {
	R apply(T t, U u, V v);
}
