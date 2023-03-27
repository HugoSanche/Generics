import java.util.Arrays;

public class River extends Line {
    private String name;

    public River(String name, String... locations){
        super(locations);
        System.out.println("*****");
        System.out.println(Arrays.deepToString(locations));
        System.out.println("*****");
        this.name=name;
    }

    @Override
    public String toString() {
        return name +" River";
    }
}
