package OOPFinalExam;

public class Snake extends Animal{
    private int lengthOfSnake;

    public int getLengthOfSnake() {
        return lengthOfSnake;
    }

    public void setLengthOfSnake(int lengthOfSnake) {
        this.lengthOfSnake = lengthOfSnake;
    }

    public Snake(String name, int weight, int lengthOfSnake) {
        super(name, weight);
        this.lengthOfSnake = lengthOfSnake;
    }
}
