public class Example_Generics {

    public static void main(String[] args) {
        MyListGeneric<String> string= new MyListGeneric<>();
        string.add("Hugo");
        string.add("Veronica");
        string.add("Pedro");
        System.out.println(string.getValue(2));

        MyListGeneric<Integer> integer =new MyListGeneric<>();

        integer.add(1);
        integer.add(3);
        integer.add(10);

        integer.remove(3);
        integer.add(50);
        System.out.println(integer.getValue(1));

        System.out.println("*************************************");

        //recibe enteros
        MyListRestricted<Integer> myListRestricted=new MyListRestricted<>();
        myListRestricted.add(10);
        myListRestricted.add(20);
        myListRestricted.add(30);

        //MyListRestricted<String> stringMyListRestricted=new MyListRestricted<>(); //error no puede recibir String solamente descendientes de Number: float integer, doublex etc

        //recibe double
        MyListRestricted<Double> myListRestrictedDouble=new MyListRestricted<>();
        myListRestrictedDouble.add(10.2);
        myListRestrictedDouble.add(20.3);
        myListRestrictedDouble.add(30.4);




    }

}
