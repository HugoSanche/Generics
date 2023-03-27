import java.util.ArrayList;
import java.util.List;

public class Layer <T extends Mappable> {
    private List<T> lista;

    public Layer(T[] lista) {
        this.lista = new ArrayList<T>(List.of(lista));
    }
public void addElements(T... elements){
        lista.addAll(List.of(elements));
}

    public void setLista(List<T> lista) {
        this.lista = lista;
    }

    public void renderLayer(){
        for (T element:lista){
               element.getRender();
        }
    }
}
