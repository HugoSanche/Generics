import java.util.List;
import java.util.ArrayList;
public class GenericsWildCard {
    public static void main(String[] Args){

        List<Integer> listaInteger =new ArrayList<>();
        listaInteger.add(5);
        show(listaInteger);

        List <Perro> listaPerro =new ArrayList<>();
        listaPerro.add(new Perro("ComoTu",1,"Cafe"));
        show(listaPerro);
        
        /* */

        List <Gato> listaGato =new ArrayList<>();
        listaGato.add(new Gato("Grizaso",1,"Gris"));
        show(listaGato);

    }
    //
    public static <T> void show(List<?> lista){
        System.out.println(lista);
    }
    public static <T> void show2(List<? extends Animal> lista){
        System.out.println(lista);
    }
}
