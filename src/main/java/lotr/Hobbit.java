package lotr;

public class Hobbit extends Character{
    public Hobbit() {
        this.power = 0;
        this.hp = 3;
    }

    private void toCry() {
        System.out.println("Hobbit says that he's too weak to kick :'(");
    }

    @Override
    public void kick(Character c) {
        toCry();
    }

    @Override
    public String toString(){
        return "Hobbit{hp=" + hp + ", power=" + power + "}";
    }
}
