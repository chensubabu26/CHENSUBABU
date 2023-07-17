package temp;

public class TestProgram {
    private static int staticVariable = 10;
    private final int constantVariable = 5;

    public static void main(String[] args) {
        TestProgram test = new TestProgram();
        test.modifyConstantMember(); // Calling a non-static method to modify the constant member
        test.accessStaticMember(); // Calling a non-static method to access the static member
    }

    public void modifyConstantMember() {
        // Attempting to modify the constant member (which is not allowed)
        // Uncommenting the line below will result in a compilation error
        // constantVariable = 7;
    }

    public void accessStaticMember() {
        // Accessing the static member in a non-static method
        System.out.println("Value of staticVariable: " + staticVariable);
    }
}
