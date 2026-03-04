package Zoo;

import java.util.ArrayList;
import java.util.List;

public class Main {
    static void main(String[] args) {
        List<Animals> animals = new ArrayList<>();

        animals.add(new Dog("Doggy", 3));
        animals.add(new Cat("kitty", 2));
        animals.add(new Bird("Rio", 1));

        for(Animals animal : animals){
            animal.getInfo();
            animal.makeSound();
            System.out.println("------------------");
        }
    }
}
