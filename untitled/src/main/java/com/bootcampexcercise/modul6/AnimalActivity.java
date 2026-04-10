package com.bootcampexcercise.modul6;

public class AnimalActivity {
    public static void main(String[] args) {
        Animal cat = new Cat();
        Animal dog = new Dog();

        Mammal mammal = new Mammal("Tom");

        mammal.setAnimal(cat);
        mammal.animalIsSleeping();
        mammal.animalIsSpeaking();

        mammal.setAnimal(dog);
        mammal.animalIsSleeping();
        mammal.animalIsSpeaking();
    }
}
