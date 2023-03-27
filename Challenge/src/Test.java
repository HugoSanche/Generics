import java.util.Arrays;

public class Test {
    public static void main(String[] args) {

        River("47.2160,-95.2348", "29.1566, -89.2495",
                "35.1556,-90.0659");
    }

    public static void River( String... locations) {
        double[][] location;

        location = new double[locations.length][];
        int index = 0;
        for (var l : locations) {
            // System.out.println(Arrays.deepToString(Mappable.stringToLatLon(l)));
            location[index++] = stringToLatLon(l);
            // System.out.println(locations[index]);
        }
       // System.out.println("*****");
       // System.out.println(Arrays.deepToString(locations));
       // System.out.println("*****");

        System.out.println("*************************");
        //SECOND WAY
        for (int i=0; i<locations.length; i++ ){
            for (int j=0; j<locations.length; j++){
                System.out.print(locations[j]+" * ");
            }
            System.out.println();
        }
    }

    static double[] stringToLatLon(String locations) {
        var split = locations.split(",");
        double lat = Double.valueOf(split[0]);
        double lon = Double.valueOf(split[1]);
        double[] x = new double[]{lat, lon};
        System.out.println(Arrays.toString(x));
        return x;
    }

}