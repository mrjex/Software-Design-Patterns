
import java.util.ArrayList;
import java.util.List;

import enums.SideEnum;
import enums.TypeEnum;

public class Player {

    public PointsAccount account = new PointsAccount();

    private List<Unit> units = new ArrayList<>();

    public UnitCreator unitCreator; // Abstract factory

    private SideEnum side;


    Player(SideEnum side) {
        this.side = side;
    }

    public PointsAccount getPointsAccount() {
        return this.account;
    }

    public List<Unit> getUnitList() {
        return this.units;
    }

    public void createUnit(TypeEnum type) {
        if (this.side == SideEnum.MARTIAN) {
            unitCreator = new MarsianCreator();
        } else {
            unitCreator = new VenusianCreator();
        }

        if (type == TypeEnum.HELICOPTER) {
            if(unitCreator.createHelicopter(this.account) != null){
                units.add(unitCreator.createHelicopter(this.account));
            }
        } else if (type == TypeEnum.ATTACK_DRONE) {
            if(unitCreator.createHelicopter(this.account) != null){
                units.add(unitCreator.createAttackDrone(this.account));
            }
        } else {
            if(unitCreator.createHelicopter(this.account) != null){
                units.add(unitCreator.createInflatableBoat(this.account));
            }
        }

    }
}
