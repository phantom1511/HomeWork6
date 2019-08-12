import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Thanos thanos = new Thanos();
        thanos.setHealth(1200);
        thanos.setDamage(50);
        thanos.setDefence(20);

        IronMan ironMan = new IronMan();
        ironMan.setHealth(300);
        ironMan.setDamage(20);

        CaptainAmerica captainAmerica = new CaptainAmerica();
        captainAmerica.setHealth(250);
        captainAmerica.setDamage(25);

        Thor thor = new Thor();
        thor.setHealth(350);
        thor.setDamage(35);

        Hulk hulk = new Hulk();
        hulk.setHealth(400);
        hulk.setDamage(30);

        System.out.println("..............Thanos..............");
        System.out.println("Health: " + thanos.getHealth() + " Damage: " + thanos.getDamage() + " Defence " + thanos.getDefence());
        System.out.println("..............IronMan..............");
        System.out.println("Health: " + ironMan.getHealth() + " Damage: " + ironMan.getDamage() + " Superpower " + ironMan.superPower());
        System.out.println("..............CaptainAmerica..............");
        System.out.println("Health: " + captainAmerica.getHealth() + " Damage: " + captainAmerica.getDamage() + " Superpower " + captainAmerica.superPower());
        System.out.println("..............Thor..............");
        System.out.println("Health: " + thor.getHealth() + " Damage: " + thor.getDamage() + " Superpower " + thor.superPower());
        System.out.println("..............Hulk..............");
        System.out.println("Health: " + hulk.getHealth() + " Damage: " + hulk.getDamage() + " Superpower " + hulk.superPower());

    }
}
