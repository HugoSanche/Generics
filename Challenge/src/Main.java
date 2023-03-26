import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Park cañon=new Park("Cañon del sumidero",16.82908660479645, -93.10600073862189);
      Park chapultepec =new Park("Bosques de Chapultepec",19.420452870098664, -99.18962746137812);
      cañon.setLocation(20.426442857403945, -98.19842510700937);


        List<Mappable> parks=new ArrayList<>();
        parks.add(cañon);
      parks.add(chapultepec);

        //cañon.getRender();
        Layer p=new Layer<>(parks);
        p.renderLayer();


    }
}