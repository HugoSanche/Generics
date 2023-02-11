import java.util.ArrayList;
class GenericTest{
    public static void main(String[] Args){

        //Checa como una sola clase puede imprimer diferentes tipos

        //print String
        Printer<String> stringToPrint =new Printer<>("Hola Mundo");
        stringToPrint.Print();

        //print integer
        Printer<Integer> intToPrint=new Printer<>(25); 
        intToPrint.Print();

        Printer<Double> doubleToPrint=new Printer<>(2.58);
        doubleToPrint.Print();

        ArrayList<Gato> cats=new ArrayList<>();
        cats.add(new Gato("Pichi", 3,"Gris"));
        cats.add(new Gato("El Cejas", 10, "Blanco"));

        Gato myGato=(Gato)cats.get(1);
    }
}
