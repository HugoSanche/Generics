public class Printer <T> {

    T thingsToPrint;

    public Printer(T thingsToPrint){
        this.thingsToPrint=thingsToPrint;
    }
    public void Print(){
        System.out.println(thingsToPrint);
    } 
}
