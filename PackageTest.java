package myPackage;

import java.lang.*;

public class PackageTest extends Object {
    public PackageTest() {
        System.out.println(this);
    }

    public static void main(String[] args) {
        new PackageTest();
    }
}
