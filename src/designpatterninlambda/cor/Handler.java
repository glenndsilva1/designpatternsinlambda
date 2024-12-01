package designpatterninlambda.cor;

@FunctionalInterface
interface Handler {
	    int handle(int number);

	    default Handler setNext(Handler nextHandler) {
	        return (int number) -> {
	            int result = this.handle(number);
	            return result != number ? result : nextHandler.handle(number);
	        };
	    }
}
