package lotr;

import java.util.Random;

public class Knight extends Royal {
    public Knight(){
        Random rand = new Random();
        this.power = rand.nextInt(11) + 2;
        this.hp = rand.nextInt(11) + 2;
    }

}
