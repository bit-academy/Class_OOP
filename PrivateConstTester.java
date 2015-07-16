class PrivateConstructor {
    private PrivateConstructor() {
        System.out.println("private ������");
    }

    public static PrivateConstructor getInstance() {
        return new PrivateConstructor();
    }
}

public class PrivateConstTester {
    public static void main(String[] args) {
        PrivateConstructor pc = null;

        // pc = new PrivateConstructor();
        pc = PrivateConstructor.getInstance();
    }
}
