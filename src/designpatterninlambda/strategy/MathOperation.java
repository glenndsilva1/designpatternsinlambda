package designpatterninlambda.strategy;

@FunctionalInterface
public interface MathOperation {
    int execute(int a, int b);
}

