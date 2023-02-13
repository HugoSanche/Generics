public class Perro extends Animal {
    String color;
    public Perro(String name, int age, String color){
        super(name,age);
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
