package OOPFinalExam;

public class Lion extends Animal{

    private int totalMeatEaten;

    public int getTotalMeatEaten() {
        return totalMeatEaten;
    }

    public void setTotalMeatEaten(int totalMeatEaten) {
        this.totalMeatEaten = totalMeatEaten;
    }

    public Lion(String name, int weight, int totalMeatEaten) {
        super(name, weight);
        this.totalMeatEaten = totalMeatEaten;
    }
}
