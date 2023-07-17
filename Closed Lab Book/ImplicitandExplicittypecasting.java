package temp;

public class ImplicitandExplicittypecasting {
	    public static void main(String[] args) {
	        // boolean
	        boolean flag = true;

	        // byte
	        byte byteValue = 127;

	        // short
	        short shortValue = 32000;

	        // int
	        int intValue = 1234567890;

	        // long
	        long longValue = 9876543210L;

	        // float
	        float floatValue = 3.14f;

	        // double
	        double doubleValue = 2.71828;

	        // char
	        char charValue = 'A';

	        // Implicit type casting
	        int implicitCasting = shortValue;
	        long implicitCasting2 = intValue;
	        double implicitCasting3 = floatValue;

	        // Explicit type casting
	        short explicitCasting = (short) intValue;
	        float explicitCasting2 = (float) doubleValue;
	        int explicitCasting3 = (int) longValue;

	        // Display values
	        System.out.println("boolean: " + flag);
	        System.out.println("byte: " + byteValue);
	        System.out.println("short: " + shortValue);
	        System.out.println("int: " + intValue);
	        System.out.println("long: " + longValue);
	        System.out.println("float: " + floatValue);
	        System.out.println("double: " + doubleValue);
	        System.out.println("char: " + charValue);

	        // Display implicit casting results
	        System.out.println("Implicit Casting 1: " + implicitCasting);
	        System.out.println("Implicit Casting 2: " + implicitCasting2);
	        System.out.println("Implicit Casting 3: " + implicitCasting3);

	        // Display explicit casting results
	        System.out.println("Explicit Casting 1: " + explicitCasting);
	        System.out.println("Explicit Casting 2: " + explicitCasting2);
	        System.out.println("Explicit Casting 3: " + explicitCasting3);
	    }
}
