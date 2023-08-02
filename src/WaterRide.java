public class WaterRide extends CarnivalRide {

    private double waterdrop;

    public WaterRide(long duration, double waterdrop){

        super("WaterRide", duration);
        this.waterdrop = waterdrop;

    }

    public WaterRide(long duration, String name, double waterdrop){

        super("WaterRide", duration, name);
        this.waterdrop = waterdrop;
    }

    public double getWaterdrop() {
        return this.waterdrop;
    }

    public void setWaterdrop(double waterdrop) {
        this.waterdrop = waterdrop;
    }

    public String fearFactor(){

        String temp = "";
        if(minutes() >= 7)
        temp = "long and engaging";

        else if(minutes() >= 5)
        temp = "fun and respectable";

        else if(minutes() <= 4)
        temp = "very short";

        String temp1 = "";

        if(waterdrop >= 40.0)
        temp1 = "suitable for fearless adults";

        else if(waterdrop >= 20.0)
        temp1 = "sutiable for most adults";

        else if(waterdrop < 20.0)
        temp1 = "safe for children";

        return String.format("%s %s %s %s%s", "It is both", temp, " and is ", temp1,".");
    }

    public String aboutRide(){

        System.out.printf("\n%s %s %s %s %s%s\n", "This carnival ride is a ", getType(), ",", " and its name is ", getName(),".");
        System.out.println(fearFactor());
        return String.format("%s %d %s %.1f %s", "This ride lasts ", minutes(), " minutes and has a water drop of ", waterdrop, " meters.");
    }
    
    public String toString(){

        return super.toString() +
        String.format("\n%-15s %.1f", "Water Drop: ", waterdrop);
    }
}
