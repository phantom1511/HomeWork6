public class Thor extends Player implements SuperPowerAvailable{
    int superpower;

    public int getSuperpower() {
        return superpower;
    }

    public void setSuperpower(int superpower) {
        this.superpower = superpower;
    }

    @Override
    public int superPower() {
        return 3;
    }
}
