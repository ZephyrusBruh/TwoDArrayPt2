public class LivingThing {
    private String name;
    private  String pieceColor;
    private int health;

    public LivingThing(String inName, int inHealth){
        setName(inName);
        setHealth(inHealth);
        pieceColor = ConsoleColors.YELLOW;
    }
    public LivingThing(String inName, int inHealth, String inColor){
        setName(inName);
        setHealth(inHealth);
        setPieceColor(inColor);
    }

    public void setName(String name){
        if (!name.trim().equals("")){
            this.name = name;
        } else {
            this.name = "undefined";
        }
    }
    public void setHealth(int health) {
        if (health > 0) {
            this.health = health;
        } else {
            this.health = 1;
        }
    }
    public void setPieceColor(String color){
        pieceColor = color;
    }
    public String getName(){
        return name;
    }
    public int getHealth(){
        return health;
    }
    public String getPieceColor(){
        return pieceColor;
    }

    public  String getConsoleStr(){
        String wow;
        wow = pieceColor + getName().charAt(0) + ConsoleColors.RESET;
        return wow;
    }

}
