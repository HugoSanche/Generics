import java.util.ArrayList;
import java.util.List;

public class Layer <T extends Mappable> {
    private List<T> lista =new ArrayList<>();

    public Layer(List<T> lista) {
        this.lista = lista;
    }

    public void setLista(List<T> lista) {
        this.lista = lista;
    }

    public void renderLayer(){
        for (var x:lista){
               System.out.println(x.getRender());
        }
    }
}
