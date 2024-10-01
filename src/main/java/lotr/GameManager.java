package lotr;

public class GameManager {
    public void fight(Character c1, Character c2) {
//        to provide fight between to characters and explain via command
//        line what happens during fight, till both of
//        the characters are alive
        System.out.println("The fight begins between " + c1.getClass().getSimpleName() + " and " + c2.getClass().getSimpleName());

        while (c1.isAlive() && c2.isAlive()) {
            c1.kick(c2);
            if (c2.isAlive()) {
                c2.kick(c1);
            }
            System.out.println(c1.getClass().getSimpleName() + ": HP=" + c1.hp + ", Power=" + c1.power + " | " + c2.getClass().getSimpleName() + ": HP=" + c2.hp + ", Power=" + c2.power);
            System.out.println("-".repeat(50));
        }

        if (c1.isAlive()) {
            System.out.println(c1.getClass().getSimpleName() + " wins!");
        } else {
            System.out.println(c2.getClass().getSimpleName() + " wins!");
        }

    }
}
