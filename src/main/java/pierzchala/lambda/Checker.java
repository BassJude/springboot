package pierzchala.lambda;

@FunctionalInterface // opcjonalnie, zeby kompilator sprawdzic, czy jest to interfej funkcyjny
public interface Checker<T> {
    boolean check(T check);
}



