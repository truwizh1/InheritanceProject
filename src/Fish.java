public class Fish extends Animal implements AnimalBehavior, AnimalMove {
    public Fish() {
        super();
    }

    public Fish(String name, int age, double weight) {
        super(name, age, weight);
    }

    @Override
    public void eat() {
        System.out.println(name + " eats algae.");
    }

    @Override
    public String getVoice() {
        return name + " cannot make sounds.";
    }

    @Override
    public void sleep() {
        System.out.println(name + " sleeps in the water.");
    }

    @Override
    public String move() {
        return "swims";
    }
}
