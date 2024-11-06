package Day8;
public class Pokemon {
    
    String name;
    int health;
    int level;
    
    static int trainerPokemon = 2;
   
    Pokemon(String name, int level){
        this.health = 100;
    }

    public String damage(){
       String remaining = this.name + "has taken 10 damage!";
       
        return remaining;
    }
    static void incrementPokemonValue(int intincrement){
        trainerPokemon += intincrement;
    }

}
