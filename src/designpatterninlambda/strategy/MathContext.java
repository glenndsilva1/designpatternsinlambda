package designpatterninlambda.strategy;

public class MathContext {
	private MathOperation operation;

    public MathContext(MathOperation operation) {
        this.operation = operation;
    }

    public int executeOperation(int a, int b) {
        return operation.execute(a, b);
    }

    public static void main(String[] args) {
        // Define the addition strategy using lambda
        MathOperation addition = (a, b) -> a + b;
        // Define the multiplication strategy using lambda
        MathOperation multiplication = (a, b) -> a * b;

        // Use MathContext to execute addition
        MathContext context = new MathContext(addition);
        System.out.println("Addition: " + context.executeOperation(5, 3));  // Output: 8

        // Use MathContext to execute multiplication
        context = new MathContext(multiplication);
        System.out.println("Multiplication: " + context.executeOperation(5, 3));  // Output: 15
    }
}
