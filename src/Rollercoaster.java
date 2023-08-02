public class Rollercoaster extends CarnivalRide{
    private int loops;

    public Rollercoaster(long duration, int loops){

        super("Rollercoaster", duration);
        this.loops = loops;
    }

    public Rollercoaster(long duration, String name, int loops){

        super("Rollercoaster", duration, name);
        this.loops = loops;
    }

    public int getLoops() {
        return this.loops;
    }

    public void setLoops(int loops) {
        this.loops = loops;
    }

    public String fearFactor(){

        String temp = "";
        if(minutes() >= 6)
        temp = "terrifying";

        else if(minutes() >= 3)
        temp = "scary";

        else if(minutes() <= 2)
        temp = "not scary";

        String temp1 = "";

        if(loops >= 5)
        temp1 = "exhilarating";

        else if(loops >= 3)
        temp1 = "intermediate";

        else if(loops <= 2)
        temp1 = "moderate";

        return String.format("%s %s %s %s%s", "It is both", temp, " and is ", temp1,".");
    }

    public String aboutRide(){

        System.out.printf("\n%s %s %s %s %s%s\n", "This carnival ride is a ", getType(), ",", " and its name is ", getName(),".");
        System.out.println(fearFactor());
        return String.format("%s %d %s %d %s", "This ride lasts ", minutes(), " minutes and has ", loops, " loops.");
    }
    
    public String toString(){

        return super.toString() + 
        String.format("\n%-15s %d", "Loops: ", loops);
    }
}
