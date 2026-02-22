package FieldMethod;

public class Person {
    String name; //field
    String address; //field
    final String country = "Indonesia"; // country = field, "Indonesia" = String literal/data

    void sayHello(String name) {
        System.out.println("Hello " + name + ", My name is " + this.name);
    } // Method sayHello menggunakan void karena tidak mengembalikan data apapun, dan hanya menampilkan teks hello my name is...
}