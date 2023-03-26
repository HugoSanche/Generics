public class Park extends Point {
    private String locationName;
    private double latitude;
    private double longitude;
    double [][] locations=new double[2][2];
    int count=0;
    public Park(String locationName, double latitude, double longitude) {
        this.locationName = locationName;
        this.latitude = latitude;
        this.longitude = longitude;
        addLocation();
        count++;
    }

    public void addLocation() {
        //System.out.println(locations);

        locations[count][0] = latitude;
        locations[count][1] = longitude;


    }
    public void setLocationName(String locationName) {
        this.locationName = locationName;
    }

    public void setLocation(double latitude,double longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
        addLocation();
        count++;
    }


    @Override
    public String getRender() {
        String message;
        message=super.getRender()+locationName+" as "+getClass().getSimpleName()+" ([ ";

        for (int i = 0; i < locations.length; i++) {
            for (int j = 0; j < locations[i].length; j++) {
                //System.out.print(locations[i][j] + " ");
                message=message+" "+locations[i][j];
            }
            if (i<locations.length-1){
                 message=message+", ";
            }

        }
        message=message+" )]";
        return  message;
    }
}
