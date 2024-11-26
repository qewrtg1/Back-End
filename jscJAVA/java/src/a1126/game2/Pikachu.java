package a1126.game2;
//1과 다르게 필드를 private로 변경
public class Pikachu {


    private int energy; 
    private String type;
	private int level;

    public int getLevel() {
        return level;
    }

    public Pikachu(){
        this(100, "전기"); 
    } 
    public Pikachu(int energy, String type) {
        this(energy, type, 1);

    }   
    public Pikachu(int energy, String type, int level) {
        this.energy = energy;
        this.type = type;
        this.level = level;
    }

    public String aAttack() {
        return "십만 볼트";
        
    }
    public String bAttack() {
        return "백만 볼트";

    }



    @Override
    public String toString() {
        return "[energy=" + energy + ", type=" + type + ", level=" + level + ", aAttack()=" + aAttack()
                + ", bAttack()=" + bAttack() + "]";
    }


    
}

