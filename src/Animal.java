class Animal {
    int eyes;

    public Animal() {
    }

    void text() {
        System.out.printf("I am an animal");
    }

    public Animal(int eyes) {
        this.eyes = eyes;
    }

    void eat() {
        System.out.printf("Animal eats");
    }

    void drink() {
        System.out.printf("Animal drinks");
    }

    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.text();
    }
}

class Pet extends Animal {
    int name;

    void text() {
        System.out.printf("I am a pet");
    }

    int tail;
    int paw;

    public Pet(int eyes, int tail, int paw) {
        super(eyes);
        this.tail = tail;
        this.paw = paw;
    }

    void run() {
        System.out.printf("Pet runs");
    }

    void jump() {
        System.out.printf("Pet runs« jumps");
    }

    public static void main(String[] args) {
        Pet pet = new Pet(2, 1, 4);
        System.out.printf("Eyes:" + pet.eyes + "; Tail:" + pet.tail + "; Paw:" + pet.paw);
    }
}

class Dog extends Pet {
    String name;

    public Dog(int eyes, int tail, int paw) {
        super(eyes, tail, paw);
    }

    public Dog(String name) {
        super(5, 6, 8);
        this.name = name;
    }

    void play() {
        System.out.printf("Dog plays");
    }

    public static void main(String[] args) {
        Dog dog1 = new Dog("Jack");
        System.out.println("I am dog and my name is " + dog1.name);
        dog1.play();
    }
}

class Cat extends Pet {
    String name;

    public Cat(int eyes, int tail, int paw) {

        super(eyes, tail, paw);
    }

    public Cat(String name) {
        super(4, 6, 4);
        this.name = name;
    }

    void sleep() {
        System.out.printf("Cat sleeps");
    }

    public static void main(String[] args) {
        Cat cat1 = new Cat("Barsik");
        System.out.println("I am a cat and my name is " + cat1.name);
        cat1.sleep();
    }
}

class Test {
    public static void main(String[] args) {
        Dog dog1 = new Dog(2, 5, 4);
        Cat cat1 = new Cat(2, 3, 4);
        System.out.println("Dog has " + dog1.paw + " paws");
        cat1.sleep();
    }
}


