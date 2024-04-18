public class Zoo {
    public static void main(String[] args) {
        Animal[] animals = new Animal[5];
        animals[0] = new Dog("Buddy", 5, 30.0, "Golden Retriever");
        animals[1] = new Pigeon("Percy", 3, 0.5, "Grey", "City Pigeon");
        animals[2] = new Blowfish("Bubbles", 2, 1.0, 0.1);
        animals[3] = new Bird("Tweety", 1, 0.3, "Yellow");
        animals[4] = new Fish("Goldie", 1, 0.2);

        for (Animal animal : animals) {
            if (animal instanceof AnimalBehavior) {
                ((AnimalBehavior) animal).sleep();
            }
        }

        for (Animal animal : animals) {
            if (animal instanceof AnimalMove) {
                System.out.println(animal.name + " " + ((AnimalMove) animal).move());
            }
        }

        for (Animal animal : animals) {
            AnimalName.name(animal.name);
        }
    }
}
