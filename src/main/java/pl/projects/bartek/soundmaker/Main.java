package pl.projects.bartek.soundmaker;

import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        SoundMaker cat = new Cat();
        SoundMaker dog = new Dog();
        SoundMaker giraffe = new Giraffe();

        List<SoundMaker> animals = new LinkedList<>();
        animals.add(cat);
        animals.add(dog);
        animals.add(giraffe);

        for (SoundMaker animal : animals) {

            animal.makeSound();
        }


    }
}
