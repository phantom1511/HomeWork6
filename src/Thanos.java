public class Thanos extends Player implements SuperPowerAvailable{
    int defence;

    public int getDefence() {
        return defence;
    }

    public void setDefence(int defence) {
        this.defence = defence;
    }

    @Override
    public int superPower() {
        return 1;
    }
}
