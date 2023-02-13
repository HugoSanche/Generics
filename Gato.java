public class Gato extends Animal {
    
    String color;
    public Gato(String nombre, int age, String color){
        super(nombre,age);
        this.color=color;
    }



    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "{" +
            " color='" + getColor() + "'" +
            "}";
    }

}
