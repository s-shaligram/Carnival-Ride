public abstract class CarnivalRide {
    
    private String type;
    private long duration;
    private String name;

    public CarnivalRide(String type, long duration){

        this.type = type;
        this.duration = duration;
        name = "unknown";

    }

    public CarnivalRide(String type, long duration, String name){

        this.type = type;
        this.duration = duration;
        this.name = name;

    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public long getDuration() {
        return this.duration;
    }

    public void setDuration(long duration) {
        this.duration = duration;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract String fearFactor();

    public abstract String aboutRide();

    public int minutes(){
         
        return ((int)duration/1000) /60;
    }

    public String toString(){

        return String.format("\n%-15s %s \n%-15s %d \n%-15s %s", "Type: ", type, "Duration: ", duration, "Name: ", name);

    }
}
