import java.util.ArrayList;
import java.util.List;

//Type casting in java is the process of converting a variable from one to type to another.class

//Without generics collections, items are converted to object type an then stored in the collections. To get items, as their
//specific type, explicit casting is required
public class TypeCasting {
    public TypeCasting() {
    }

    public static void main(String[] args) {

        List list=new ArrayList<>();


        //Lo guarda como Object
        list.add("Hugo");

        //String myList=list.get(0);
        String MyList=(String)list.get(0);

    }

}
