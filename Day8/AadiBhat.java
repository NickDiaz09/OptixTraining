package Day8;

public class AadiBhat extends Pokemon {
    public int health;

     AadiBhat(String name, int level){
        super(name, level);
     }
    public void attack() {
        System.out.println("Aadi misses his attack and hits himself instead! Aadi takes 10 damage!");
    }
}
