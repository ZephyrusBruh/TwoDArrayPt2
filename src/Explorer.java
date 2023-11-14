import java.util.ArrayList;

public class Explorer extends LivingThing{
    private ArrayList<Treasure> treasures;

    public Explorer(String inName, int inHealth, String inColor) {
        super(inName, inHealth, inColor);
        treasures = new ArrayList<>();
    }

    public ArrayList<Treasure> getTreasures() {
        return treasures;
    }
    public void addTreasure(Treasure treasure){
        this.treasures.add(treasure);
    }

    public int getTreasureValue(){
        int sum = 0;
        for(int i = 0; i < treasures.size(); i++){
            sum += treasures.get(i).getValue();
        }
        return  sum;
    }
}
