
public class PointsAccount
{
    private int points;

    PointsAccount(){
        points = 0;
    }

    public void spendPoints(int cost)
    {
        this.points -= cost;
    }

    public int getPoints()
    {
        return this.points;
    }

    public void setPoints(int points)
    {
        this.points = points;
    }
}
