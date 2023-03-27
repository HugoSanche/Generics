import java.util.Arrays;

abstract class Line implements Mappable{

    private double[][] locations;
    public Line(String... locations){
        this.locations=new double[locations.length][];
        int index=0;
        for (var l:locations){
            this.locations[index++]=Mappable.stringToLatLon(l);
           // System.out.println(locations[index]);
        }
    }

    private String locations(){
        return Arrays.deepToString(locations);
    }

    @Override
    public void getRender() {
        System.out.println("Render "+this + "as LINE ("+locations()+")");
    }

}
