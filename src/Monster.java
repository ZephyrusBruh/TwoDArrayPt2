public class Monster extends LivingThing{
    private int damage;
    public Monster(String inName, int inHealth, String inColor, int inDamage) {
        super(inName, inHealth, inColor);
        damage = inDamage;
    }

    public int getDamage() {
        return damage;
    }
    public void Hurt(LivingThing object){
        object.setHealth(object.getHealth() - getDamage());
    }
}
