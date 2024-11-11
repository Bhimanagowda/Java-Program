/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Constructor;

import java.util.Scanner;

/**
 *
 * @author Windows
 */
public class Animal {
       String sound;

    void getSoundFromUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the sound of the animal: ");
        sound = scanner.nextLine();
    }

    void sound() {
        System.out.println("Animal makes a sound: " + sound);
    }
}


class Dog extends Animal{
    @Override
    void getSoundFromUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the sound of the dog: ");
        sound = scanner.nextLine();
    }

@Override
    void sound() {
        System.out.println("Dog barks: " + sound);
    }
}

class Demo {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Dog dog = new Dog();


        animal.getSoundFromUser();
        dog.getSoundFromUser();

      
        animal.sound();
        dog.sound();

    }
}

    

