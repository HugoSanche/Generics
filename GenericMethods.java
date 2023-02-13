public class GenericMethods {
    public static void main(String[] Args){
        //one parameter
        show1("Welcome to Mexico");
        show1(35);
        show1(new Perro("Solin",3,"Grey"));

        //TWo parameters
        show2("Welcome to Mexico", "Hugo");
        show2("La mejor edad para viajar es ",25);

        //RETURN value

    }

    public static <T> void show1(T thingsToShow){
        System.out.println(thingsToShow +".");
    }
    public static <T,V> void show2(T thingToShow, V OtherThingsToShow){
        System.out.println(thingToShow+" "+OtherThingsToShow);
    }
    public static <T,V> T show3(T thingToShow, V OtherThingsToShow){
        System.out.println(thingToShow+" "+OtherThingsToShow);
        return thingToShow;
    }


}
