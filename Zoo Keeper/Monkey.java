package OOPFinalExam;

public class Monkey extends Animal{
    private String favoriteFood;

    public String getFavoriteFood() {
        return favoriteFood;
    }

    public void setFavoriteFood(String favoriteFood) {
        this.favoriteFood = favoriteFood;
    }

    public Monkey(String name, int weight, String favoriteFood) {
        super(name, weight);
        this.favoriteFood = favoriteFood;
    }
}
