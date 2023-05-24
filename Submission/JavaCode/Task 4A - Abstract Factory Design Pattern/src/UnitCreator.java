
public interface UnitCreator {

    public static final int HELCIOPTER_COST = 100;
    public static final int ATTACKDRONE_COST = 500;
    public static final int INFLATABLEBOAT_COST = 300;
    public static final int HELCIOPTER_SPEED = 60;
    public static final int ATTACKDRONE_SPEED = 80;
    public static final int INFLATABLEBOAT_SPEED = 20;
    public static final int HELCIOPTER_ATTACK = 100;
    public static final int ATTACKDRONE_ATTACK = 40;
    public static final int INFLATABLEBOAT_ATTACK = 20;
    public static final int HELCIOPTER_DEFENSE = 30;
    public static final int ATTACKDRONE_DEFENSE = 60;
    public static final int INFLATABLEBOAT_DEFENSE = 80;
    public static final int HELCIOPTER_HEALTH = 1000;
    public static final int ATTACKDRONE_HEALTH = 700;
    public static final int INFLATABLEBOAT_HEALTH = 800;

    public Helicopter createHelicopter(PointsAccount playerAccount);

    public AttackDrone createAttackDrone(PointsAccount playerAccount);

    public InflatableBoat createInflatableBoat(PointsAccount playerAccount);
}
