public class Bird extends Animal implements AnimalBehavior, AnimalMove {
    String featherColor;

    public Bird() {
        super();
        this.featherColor = "Unknown";
    }

    public Bird(String name, int age, double weight, String featherColor) {
        super(name, age, weight);
        this.featherColor = featherColor;
    }

    @Override
    public void eat() {
        System.out.println(name + " pecks at seeds.");
    }

    @Override
    public String getVoice() {
        return name + " chirps";
    }

    @Override
    public void sleep() {
        System.out.println(name + " sleeps perched in a tree.");
    }

    @Override
    public String move() {
        return "flies";
    }

    @Override
    public String toString() {
        return super.toString() + ", Feather Color: " + featherColor;
    }
}
