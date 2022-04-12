package funtionalInterface.seven;

@FunctionalInterface
public interface Calculate<T> {

    T calculate(T[] a);
}
