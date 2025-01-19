import java.util.ArrayList;
import java.util.List;

//Bounded type parameters

//Allow you to restrict the types that can be used as arguments for a type parameter in a generic class.

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
