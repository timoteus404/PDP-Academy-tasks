package funtionalInterface.six;

@FunctionalInterface
public interface Calculate<T> {

    T calculate(T[] a);
}
