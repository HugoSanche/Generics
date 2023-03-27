public class Park extends Point {
    private String name;

    int count=0;
    public Park(String name, String location) {
        super(location);
        this.name = name;
    }

    @Override
    public String toString() {
        return name +"National Park ";
    }

}
