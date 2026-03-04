package Zoo;

public abstract class Animals {
    private final String name;
    private final int age;

    public Animals(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public abstract void makeSound();

    public void getInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}
