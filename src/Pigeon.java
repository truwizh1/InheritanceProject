public class Pigeon extends Bird implements AnimalBehavior, AnimalMove {
    String species;

    public Pigeon() {
        super();
        this.species = "Unknown";
    }

    public Pigeon(String name, int age, double weight, String featherColor, String species) {
        super(name, age, weight, featherColor);
        this.species = species;
    }

    @Override
    public void sleep() {
        System.out.println(name + " sleeps in a nest.");
    }

    @Override
    public String move() {
        return "flies";
    }

    @Override
    public String toString() {
        return super.toString() + ", Species: " + species;
    }
}
