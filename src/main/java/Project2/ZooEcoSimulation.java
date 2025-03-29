package Project2;

interface AnimalBehavior{
    void eat();
    void sleep();
    void makeSound();

}
abstract class Animal implements AnimalBehavior {
    String name;
    int age;

    public Animal(String name, int age){
        this.name=name;
        this.age=age;

    }

    public void sleep(){
        System.out.println(name + " is sleeping");
    }
    abstract void displayInformation();

    }
    class Mammal extends Animal {
    public Mammal(String name, int age){
        super(name, age);

    }
    public void eat(){
        System.out.println(name + " eats meat");
    }
    public void makeSound(){
        System.out.println(name + " roars.");
    }
    void displayInformation(){
        System.out.println(name + " is a mammal of Age: " + age);
    }
    }
    class Bird extends Animal {
        public Bird(String name, int age) {
            super(name, age);
        }

            @Override
            public void eat () {
                System.out.println(name + " eats seeds");
            }
            @Override
            public void makeSound () {
                System.out.println(name + " chirps.");
            }

            @Override
            void displayInformation () {
                System.out.println(name + " is a bird of age: " + age);
            }
        }

    class Lion extends Mammal {
    public Lion(String name, int age){
        super(name, age);
    }        @Override
        public void eat () {
            System.out.println(name + " eats meat");
        }
        @Override
        public void makeSound () {
            System.out.println(name + " roars.");
        }

        @Override
        void displayInformation () {
            System.out.println(name + " is a mammal of age: " + age);
        }



    }
    class Elephant extends Mammal {
    public Elephant(String name, int age){
        super(name, age);

    }
        @Override
        public void eat () {
            System.out.println(name + " eats bananas");
        }
        @Override
        public void makeSound () {
            System.out.println(name + " trumpets.");
        }

        @Override
        void displayInformation () {
            System.out.println(name + " is a mammal of age: " + age);
        }


    }
    class Parrot extends Bird{
    public Parrot(String name, int age) {
        super(name, age);
    }
        @Override
        public void eat () {
            System.out.println(name + " eats seeds");
        }
        @Override
        public void makeSound () {
            System.out.println(name + " chirps.");
        }

        @Override
        void displayInformation () {
            System.out.println(name + " is a bird of age: " + age);
        }



    }
    class Eagle extends Bird {
        public Eagle(String name, int age){
            super(name, age);

        }
        @Override
        public void eat () {
            System.out.println(name + " eats meats");
        }
        @Override
        public void makeSound () {
            System.out.println(name + "  brayings");
        }

        @Override
        void displayInformation () {
            System.out.println(name + " is a bird of age: " + age);
        }


    }

public class ZooEcoSimulation {
    public static void main(String[] args) {
        Animal lion=new Lion("Lion", 5);
        Animal elephant=new Elephant("Elephant", 10);
        Animal parrot=new Parrot("Parrot", 2);
        Animal eagle= new Eagle("Eagle", 3);


        lion.eat();;
        lion.makeSound();
        lion.displayInformation();

        elephant.eat();
        elephant.makeSound();
        elephant.displayInformation();

        parrot.eat();
        parrot.makeSound();
        parrot.displayInformation();

        eagle.eat();
        eagle.makeSound();
        eagle.displayInformation();

    }

}
