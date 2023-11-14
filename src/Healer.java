public class Healer extends LivingThing{
    private int healValue;
    public Healer(String inName, int inHealth, String inColor, int inHealVal) {
        super(inName, inHealth, inColor);
        healValue = inHealVal;
    }
    public int getHealValue(){
        return healValue;
    }
    public void Heal(LivingThing object){
        object.setHealth(object.getHealth() - getHealValue());
    }
}
