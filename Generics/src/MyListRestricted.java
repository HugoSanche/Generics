import java.util.ArrayList;
import java.util.List;

public class MyListRestricted< T extends Number> {
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
