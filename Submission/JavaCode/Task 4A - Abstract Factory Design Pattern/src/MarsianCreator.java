
public class MarsianCreator implements UnitCreator {

    public MarsianHelicopter createHelicopter(PointsAccount playerAccount) {
        MarsianHelicopter temp = new MarsianHelicopter(HELCIOPTER_DEFENSE, HELCIOPTER_ATTACK, HELCIOPTER_SPEED,
                HELCIOPTER_COST, HELCIOPTER_HEALTH);

        int cost = temp.getCost();
        if (playerAccount.getPoints() >= cost) {
            playerAccount.spendPoints(cost);
            return temp;

        } else {
            System.out.println("Not enough money G");
        }
        throw new NullPointerException("Could not create unit");
    }

    public MarsianInflatableBoat createInflatableBoat(PointsAccount playerAccount) {
        MarsianInflatableBoat temp = new MarsianInflatableBoat(INFLATABLEBOAT_DEFENSE, INFLATABLEBOAT_ATTACK,
                INFLATABLEBOAT_SPEED,
                INFLATABLEBOAT_COST, INFLATABLEBOAT_HEALTH);
        int cost = temp.getCost();

        if (playerAccount.getPoints() >= cost) {
            playerAccount.spendPoints(cost);
            return temp;
        } else {
            System.out.println("Not enough money G");
        }
        throw new NullPointerException("Could not create unit");

    }

    public MarsianAttackDrone createAttackDrone(PointsAccount playerAccount){
        final double MARITAN_SPEED_BONUS = 1.2;
        MarsianAttackDrone temp = new MarsianAttackDrone(ATTACKDRONE_DEFENSE, ATTACKDRONE_ATTACK,
                (int) (ATTACKDRONE_SPEED * MARITAN_SPEED_BONUS), ATTACKDRONE_COST,
                ATTACKDRONE_HEALTH);
        int cost = temp.getCost();
        if (playerAccount.getPoints() >= cost) {
            playerAccount.spendPoints(cost);
            return temp;
        } else {
            System.out.println("Not enough money G");

        }
        throw new NullPointerException("Could not create unit");


    }

}
