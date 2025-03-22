
import enums.SideEnum;
import enums.TypeEnum;

public class Main {

    public static void main(String[] args) {

        Player player1 = new Player(SideEnum.VENUSIAN);

        try {
            player1.getPointsAccount().setPoints(0); // Should not be able to afford any units
            player1.createUnit(TypeEnum.HELICOPTER);
            player1.createUnit(TypeEnum.ATTACK_DRONE);
            player1.createUnit(TypeEnum.INFLATABLE_BOAT);
            player1.createUnit(TypeEnum.ATTACK_DRONE);

            System.out.println(player1.getUnitList().toString());
            System.out.println("POINTS ARE " + player1.getPointsAccount().getPoints());
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
