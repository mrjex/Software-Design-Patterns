
public class AttackDrone extends Unit {

    // Martian attack drones have higher speed

    AttackDrone(int defense, int attack, int speed, int cost, int hp) {
        super(defense, attack, speed, cost, hp);
    }

    public void hover() {
        System.out.println("Drone is hovering!");
    }

}
