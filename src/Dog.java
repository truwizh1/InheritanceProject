public class Dog extends Mammal implements AnimalBehavior, AnimalMove {
    String breed;

    public Dog() {
        super();
        this.breed = "Unknown";
    }

    public Dog(String name, int age, double weight, String breed) {
        super(name, age, weight);
        this.breed = breed;
    }

    @Override
    public void sleep() {
        System.out.println(name + " sleeps in a doghouse.");
    }

    @Override
    public String move() {
        return "runs";
    }

    @Override
    public String toString() {
        return super.toString() + ", Breed: " + breed;
    }
}
