
public abstract class Unit {

    private int speed;
    private int attack;
    private int defense;
    private int cost;
    private int hp;

    Unit(int defense, int attack, int speed, int cost, int hp) {
        this.speed = speed;
        this.cost = cost;
        this.attack = attack;
        this.defense = defense;
        this.hp = hp;
    }

    public void control() {
        System.out.println("Player is controlling units!");
    }

    public void attack() {
        System.out.println("Player is attacking with units!");
    }

    public int getCost() {
        return this.cost;
    }

    public String toString() {
        return this.getClass().toString();
    }

}
