
public abstract class Helicopter extends Unit {

    public Helicopter(int defense, int attack, int speed, int cost, int hp) {
        super(defense, attack, speed, cost, hp);
    }

    public void fly() {
        System.out.println("Helicopter is flying!");
    }
}
