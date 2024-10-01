package lotr;

public class Elf extends Character {
    public Elf() {
        this.power = 10;
        this.hp = 10;
    }
    @Override
    public void kick(Character c) {
        if (this.getPower()>c.getPower()){
            c.setHp(0);
        } else{
            c.setPower(c.getPower()-1);
            this.setHp(this.getHp() - c.getPower());
        }
    }
}
