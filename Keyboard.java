import java.util.Arrays;

public class Keyboard {
    private double mostPressed = 0;
    private double total = 0;
    private Integer[] keys;

    public Keyboard(){
        keys = new Integer[30];
        Arrays.fill(keys, 0);
    }

    public void add(String letter){
        if(hash(letter) != 0) total++;
        Integer current = ++keys[hash(letter)];
        if(current > mostPressed){
            mostPressed = current;
        }
    }

    public double getRedness(String letter){
        return (double) getKey(letter) / total;

    }

    public int getKey(String letter){
        return keys[hash(letter)];
    }

    public void clear(){
        keys = new Integer[30];
        Arrays.fill(keys, 0);
        mostPressed = 0;
        total = 0;
    }


    public int hash(String letter){
        switch(letter.toUpperCase()){
            default:
                return 0;
            case "A":
                return 1;
            case "B":
                return 2;
            case "C":
                return 3;
            case "D":
                return 4;
            case "E":
                return 5;
            case "F":
                return 6;
            case "G":
                return 7;
            case "H":
                return 8;
            case "I":
                return 9;
            case "J":
                return 10;
            case "K":
                return 11;
            case "L":
                return 12;
            case "M":
                return 13;
            case "N":
                return 14;
            case "O":
                return 15;
            case "P":
                return 16;
            case "Q":
                return 17;
            case "R":
                return 18;
            case "S":
                return 19;
            case "T":
                return 20;
            case "U":
                return 21;
            case "V":
                return 22;
            case "W":
                return 23;
            case "X":
                return 24;
            case "Y":
                return 25;
            case "Z":
                return 26;
            case "Æ":
                return 27;
            case "Ø":
                return 28;
            case "Å":
                return 29;
        }
    }




}
