import java.io.Serializable;
//in this example only will be recieve class extends from Animal
//Si quieres implementar una interface se usa extends NO implementes en genericos
//En genericos puedes extender una sola clase y varias interfaces 
public class PrinterAnimal<T extends Animal & Serializable> {
    T thingsAnimal;

    public PrinterAnimal(T thingsAnimal){
        this.thingsAnimal=thingsAnimal;
    }
    
}
