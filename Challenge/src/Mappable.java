
public interface Mappable {

     void getRender();

    static double[] stringToLatLon(String locations) {
       var split= locations.split(",");
       double lat=Double.valueOf(split[0]);
       double lon=Double.valueOf(split[1]);
       return new double[]{lat,lon};
    }

}
