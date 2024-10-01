package lotr;

import static java.lang.Math.max;

public class Character {
    protected int power=10, hp=10;

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = max(power, 0);
    }

    public void setHp(int hp) {
        this.hp = max(hp, 0);
    }

    public int getHp() {
        return hp;
    }

    public void kick(Character c){
        c.setHp(max((c.hp - this.power), 0));
    }
    public boolean isAlive(){
        return hp>0;
    }
}
