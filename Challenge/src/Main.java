public class Main {
    public static void main(String[] args) {

//      var nationalUSParks=new Park[]{
//              new Park("Yellowstone","44.4882, -110.5916"),
//              new Park("Grand Canyon","44.4882, -110.5916"),
//              new Park("Yosemite","44.4882, -110.5916"),
//      };
//        Layer<Park> parkLayer=new Layer<>(nationalUSParks);
//        parkLayer.renderLayer();

        var majorUSRivers=new River[]{
            new River("Mississippi", "47.2160,-95.2348","29.1566, -89.2495",
                                        "35.1556,-90.0659"),
                new River("Missouri", "45.9260,-111.4948","38.8166, -90.1295")
        };
        Layer<River> riverLayer=new Layer<>(majorUSRivers);
        riverLayer.addElements(
                new River("Colorado", "40.4708,-105.8286","31.7811, -114.7774"),
                new River("Delaware", "42.2026,-75.00836","39.4955, -75.5592")
        );
        riverLayer.renderLayer();

    }
}