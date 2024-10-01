package lotr;

import java.util.Random;

abstract class Royal extends Character {
    @Override
    public void kick(Character c) {
        Random rand = new Random();
        c.setHp(c.getHp()-(rand.nextInt(this.power)+1));
    }
}
