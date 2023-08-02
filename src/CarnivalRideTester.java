import java.util.ArrayList;

public class CarnivalRideTester {
    
    public static void main(String[] args) {
        
        
        Rollercoaster c1 = new Rollercoaster(300000,3);

        Rollercoaster c2 = new Rollercoaster(420000, "Rocky Roller", 5);

        WaterRide w1 = new WaterRide(200000, 18.0);

        WaterRide w2 = new WaterRide(290000, "River Nile", 35.0);

        System.out.println(c1.toString());

        System.out.println(c2.toString());

        System.out.println(w1.toString());

        System.out.println(w2.toString());

        System.out.print("\nRide type: " + w2.getType());
        System.out.print("\nRide name: " + w2.getName());
        System.out.print("\nRide duration: " + w2.getDuration());
        System.out.print("\nRide water drop: " + w2.getWaterdrop());
        

        System.out.print("\n\nModified objects: ");
        w2.setWaterdrop(95.0);
        c1.setName("King Kong");
        System.out.print("\nRide water drop: " + w2.getWaterdrop());
        System.out.print("\nRide name: " + c1.getName());
        System.out.println();

        ArrayList<CarnivalRide> clist = new ArrayList<>();

        clist.add(c1);

        clist.add(c2);

        clist.add(w1);

        clist.add(w2);

        for(CarnivalRide R: clist){

            System.out.println(R.aboutRide());
        }
    }
}
