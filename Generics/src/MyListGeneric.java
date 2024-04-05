import java.util.ArrayList;
import java.util.List;


//una misma clase puede realizar tareas con diferentes tipos de datos
public class MyListGeneric <T>{
    private List<T> myValue=new ArrayList<>();

    public void add(T value){
        myValue.add(value);
    }
    public void remove(T value){
        myValue.remove(value);
    }
    public T getValue(int index){
        return myValue.get(index);
    }

}
