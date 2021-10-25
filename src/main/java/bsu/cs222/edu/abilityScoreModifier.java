package bsu.cs222.edu;

public class abilityScoreModifier {
    public static int strMod;
    public static int dexMod;
    public static int conMod;
    public static int intMod;
    public static int wisMod;
    public static int charMod;
    public static int number;

    // put try catch statement for modifier values associated with ability scores
    public int modifierIndex(int abilityNum){
        if (abilityNum == 1){
            number = -5;
        } else if (abilityNum == 2 || abilityNum == 3){
            number = -4;
        } else if (abilityNum == 4 || abilityNum == 5){
            number = -3;
        } else if (abilityNum == 6 || abilityNum == 7){
            number = -2;
        } else if (abilityNum == 8 || abilityNum == 9){
            number = -1;
        } else if (abilityNum == 10 || abilityNum == 11){
            number = 0;
        } else if (abilityNum == 12 || abilityNum == 13){
            number = 1;
        } else if (abilityNum == 14 || abilityNum == 15){
            number = 2;
        } else if (abilityNum == 16 || abilityNum == 17){
            number = 3;
        } else if (abilityNum == 18 || abilityNum == 19){
            number = 4;
        } else if (abilityNum == 20 || abilityNum == 21){
            number = 5;
        } else if (abilityNum == 22 || abilityNum == 23){
            number = 6;
        } else if (abilityNum == 24 || abilityNum == 25){
            number = 7;
        } else if (abilityNum == 26 || abilityNum == 27){
            number = 8;
        } else if (abilityNum == 28 || abilityNum == 29){
            number = 9;
        } else if (abilityNum == 30){
            number = 10;
        } else {
            throw new Error();
        }
        return number;
    }

    public void setStrMod(int strMod) {
        this.strMod = modifierIndex(abilityScores.getStrength());
    }

    public void setDexMod(int dexMod) {
        this.dexMod = modifierIndex(abilityScores.getDexterity());
    }

    public void setConMod(int conMod) {
        this.conMod = modifierIndex(abilityScores.getConstitution());
    }

    public void setIntMod(int intMod) {
        this.intMod = modifierIndex(abilityScores.getIntelligence());
    }

    public void setWisMod(int wisMod) {
        this.wisMod = modifierIndex(abilityScores.getWisdom());
    }

    public void setCharMod(int charMod) {
        this.charMod = modifierIndex(abilityScores.getCharisma());
    }

    public static int getStrMod() {
        return strMod;
    }

    public static int getDexMod() {
        return dexMod;
    }

    public static int getConMod() {
        return conMod;
    }

    public static int getIntMod() {
        return intMod;
    }

    public static int getWisMod() {
        return wisMod;
    }

    public static int getCharMod() {
        return charMod;
    }
}
