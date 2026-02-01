public class BaseStats {
   private int strength;
   private int intelligence;
   private int dexterity;
   private int constitution;
   private int wisdom;
   private int charisma;

    public BaseStats(int strength, int intelligence, int dexterity, int constitution, int wisdom, int charisma){
        this.strength = strength;
        this.intelligence = intelligence;
        this.dexterity = dexterity;
        this.constitution = constitution;
        this.wisdom = wisdom;
        this.charisma = charisma;
    }

    public int getStrength(){
        return this.strength;
    }

    public int getIntelligence(){
        return this.intelligence;
    }

    public int getDextterity(){
        return this.dexterity;
    }

    public int getConstitution(){
        return this.constitution;
    }

    public int getWisdom(){
        return this.wisdom;
    }

    public int getCharisma(){
        return this.charisma;
    }

    public String getAllStatsAsString(){
        return String.join("\n",
            String.valueOf(dexterity),
            String.valueOf(intelligence),
            String.valueOf(dexterity),
            String.valueOf(constitution),
            String.valueOf(wisdom),
            String.valueOf(charisma)
        );
    }
}
