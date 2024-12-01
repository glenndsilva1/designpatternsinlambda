package designpatterninlambda.cor;

public class ChainOfResponsibilityExample {
	public static void main(String[] args) {
        // Handler 1: Adds 5 if the number is less than 10
        Handler addFive = (number) -> {
            if (number < 10) {
                System.out.println("Adding 5 to " + number);
                return number + 5;
            }
            return number;
        };

        // Handler 2: Multiplies by 2 if the number is greater than 15
        Handler multiplyByTwo = (number) -> {
            if (number > 15) {
                System.out.println("Multiplying " + number + " by 2");
                return number * 2;
            }
            return number;
        };

        // Handler 3: Subtracts 3 if the number is even
        Handler subtractThree = (number) -> {
            if (number % 2 == 0) {
                System.out.println("Subtracting 3 from " + number);
                return number - 3;
            }
            return number;
        };

        // Chain handlers
        Handler chain = addFive
                        .setNext(multiplyByTwo)
                        .setNext(subtractThree);

        // Test numbers
        int number = 7;
        System.out.println("Initial number: " + number);
        number = chain.handle(number); // Apply the chain of handlers
        System.out.println("Final result: " + number);

        number = 18;
        System.out.println("\nInitial number: " + number);
        number = chain.handle(number); // Apply the chain of handlers
        System.out.println("Final result: " + number);
    }
}
