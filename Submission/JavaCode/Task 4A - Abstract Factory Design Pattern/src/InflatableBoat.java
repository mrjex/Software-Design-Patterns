
public abstract class InflatableBoat extends Unit {

    InflatableBoat(int defense, int attack, int speed, int cost, int hp) {
        super(defense, attack, speed, cost, hp);
    }

    public void stayAfloat() {
        System.out.println("Boat is floating!");
    }

}
