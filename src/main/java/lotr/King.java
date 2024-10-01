package lotr;
import java.util.Random;

public class King extends Royal {
    public King(){
        Random rand = new Random();
        this.power = rand.nextInt(11) +5;
        this.hp = rand.nextInt(11) +5;
    }
}
