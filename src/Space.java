public class Space {
    private LivingThing occupant;
    private Treasure cache;

    public Space(){
        occupant = null;
    }
    public Space(LivingThing object){
        setOccupant(object);
    }

    public LivingThing getOccupant(){
        return occupant;
    }
    public void cache(){
        cache = null;
    }
    public void cache(Treasure object) {
        cache = object;
    }

    public String getConsoleStr(){
        if (occupant == null){
            return "-";
        } else {
            return occupant.getConsoleStr();
        }
    }
    public void setOccupant(LivingThing object){
        occupant = object;
    }
    
    public Treasure getCache(){
        return cache;
    }
    public void setCache(Treasure object){
        cache = object;
    }
    public String getConsoleStr(Boolean in){
        if (in = true){
            return getConsoleStr();
        } else {
            if (occupant != null){

            }
        }
        return "butt";
    }


}
