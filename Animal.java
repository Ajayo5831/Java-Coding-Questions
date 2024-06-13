class Animal {
    public void AnimalSound() {
        System.out.println("The animal makes a sound");
    }
}

class Pig extends Animal {
    public void AnimalSound() {
        System.out.println("pig sounds like : wee wee ");
    }
}

class Dog extends Animal {
    public void AnimalSound() {
        System.out.println(" dogs sound like : bow  bow");
    }
}

class Hello {
    public static void main(String[] args) {
        Animal myAnimal = new Animal();
        Animal myPig = new Pig();
        Animal myDog = new Dog();
        myAnimal.AnimalSound();
        myPig.AnimalSound();
        myDog.AnimalSound();
    }
}
