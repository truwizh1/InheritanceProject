public class Blowfish extends Fish implements AnimalBehavior, AnimalMove {
    double toxinLevel;

    public Blowfish() {
        super();
        this.toxinLevel = 0.0;
    }

    public Blowfish(String name, int age, double weight, double toxinLevel) {
        super(name, age, weight);
        this.toxinLevel = toxinLevel;
    }

    @Override
    public void sleep() {
        System.out.println(name + " sleeps floating in water.");
    }

    @Override
    public String move() {
        return "swims";
    }

    @Override
    public String toString() {
        return super.toString() + ", Toxin Level: " + toxinLevel;
    }
}
