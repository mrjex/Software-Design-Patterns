
public class VenusianCreator implements UnitCreator {

    public VenusianHelicopter createHelicopter(PointsAccount playerAccount) {
        Unit unit = new VenusianHelicopter(HELCIOPTER_DEFENSE, HELCIOPTER_ATTACK, HELCIOPTER_SPEED,
                HELCIOPTER_COST, HELCIOPTER_HEALTH);
        int cost = unit.getCost();
        if (playerAccount.getPoints() >= cost) {
            playerAccount.spendPoints(cost);

        } else {
            System.out.println("Not enough money G");
            return null;

        }

        return (VenusianHelicopter) unit;
    }

    public VenusianInflatableBoat createInflatableBoat(PointsAccount playerAccount) {
        final double VENUSIAN_INFLATABLEBOAT_DEFENSE_BONUS = 1.5;
        Unit unit = new VenusianInflatableBoat((int) (INFLATABLEBOAT_DEFENSE * VENUSIAN_INFLATABLEBOAT_DEFENSE_BONUS),
                INFLATABLEBOAT_ATTACK, INFLATABLEBOAT_SPEED,
                INFLATABLEBOAT_COST, INFLATABLEBOAT_HEALTH);
        int cost = unit.getCost();

        if (playerAccount.getPoints() >= cost) {
            playerAccount.spendPoints(cost);

        } else {
            System.out.println("Not enough money G");
            return null;

        }

        return (VenusianInflatableBoat) unit;
    }

    public VenusianAttackDrone createAttackDrone(PointsAccount playerAccount) {
        Unit unit = new VenusianAttackDrone(ATTACKDRONE_DEFENSE, ATTACKDRONE_ATTACK,
                ATTACKDRONE_SPEED, ATTACKDRONE_COST,
                ATTACKDRONE_HEALTH);
        int cost = unit.getCost();

        if (playerAccount.getPoints() >= cost) {
            playerAccount.spendPoints(cost);

        } else {
            System.out.println("Not enough money G");
            return null;

        }

        return (VenusianAttackDrone) unit;
    }

}
