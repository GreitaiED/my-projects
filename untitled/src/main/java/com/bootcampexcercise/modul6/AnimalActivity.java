package com.bootcampexcercise.modul6;

public class AnimalActivity {
    public static void main(String[] args) {
        Animal cat = new Cat();
        Animal dog = new Dog();

        Mammal catMammal = new Mammal("Tom");
        Mammal dogMammal = new Mammal("Bob");

        catMammal.setAnimal(cat);
        catMammal.animalIsSleeping();
        catMammal.animalIsSpeaking();

        dogMammal.setAnimal(dog);
        dogMammal.animalIsSleeping();
        dogMammal.animalIsSpeaking();
    }
}
