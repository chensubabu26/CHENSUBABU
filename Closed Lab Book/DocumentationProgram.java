package temp;

/**
 * This program demonstrates how to document Java code using comments.
 * It also provides examples for executing the program with different class and file names,
 * as well as different modifiers for the main method.
 */
public class DocumentationProgram {
    /**
     * This is the main method that executes when the program starts.
     * It prints a simple message to the console.
     *
     * @param args the command-line arguments
     */
    public static void main(String[] args) {
        System.out.println("Hello, world!");
    }
}

javadoc DocumentationProgram.java

javac DifferentName.java
java DifferentName

Without the public modifier

class NoPublicModifier {
    static void main(String[] args) {
        System.out.println("Hello, world!");
    }
}

Without the static modifier

class NoStaticModifier {
    public void main(String[] args) {
        System.out.println("Hello, world!");
    }
}

Without function parameter

class NoParameter {
    public static void main() {
        System.out.println("Hello, world!");
    }
}