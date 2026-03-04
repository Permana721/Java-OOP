package Zoo;

public class Bird extends Animals{
    public Bird(String name, int age){
        super(name, age);
    }

    public void makeSound(){
        System.out.println("Tweet!");
    }
}
