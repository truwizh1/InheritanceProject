public interface AnimalMove {
    default String move() {
        return "moves in its own way";
    }
}
