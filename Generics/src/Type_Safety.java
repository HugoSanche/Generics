import java.util.ArrayList;
import java.util.List;

//Type safety means that the compiler will validate types while compíling and show and error if ypu try to assign the wrong
//type to a variable
public class Type_Safety {

    public static void main(String[] args) {
        Integer var=10;

        var="Valeria"; //compile time error

        List<Integer> entero=new ArrayList<>();

        entero.add(10);

        //Compile time error due to tyoe safety
        //compiler ensueres that you must the correcto type
        entero.add("Valeria");

    }
}
