public class Treasure {
    private int value;
    private String description;
    public Treasure() {
        setDescription("gold");
        setValue(5);
    }
    public Treasure(int inVal, String inDesc){
        setValue(inVal);
        setDescription(inDesc);
    }
    public int getValue(){
        return value;
    }
    public String getDescription(){
        return description;
    }
    public void setValue(int inVal){
        value = inVal;
    }
    public void setDescription(String inDesc){
        description = inDesc;
    }

    public String getConsoleStr(){
        return ConsoleColors.YELLOW_BOLD + "T" + ConsoleColors.RESET;
    }
}
