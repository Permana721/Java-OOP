package Constructor;

public class Person {
    String name;
    String address;
    final String country = "Indonesia";

    Person(String paramName, String paramAddress) {
        name = paramName;
        address = paramAddress;
    } // Constructor adalah method  yang akan dipanggil saat pertama kali Object dibuat
      // Dan tidak membutuhkan return value seperti void, int, String, dll

    void sayHello(String paramName) {
        System.out.println("\nHello " + paramName + ", My name is " + this.name);
    }
}
