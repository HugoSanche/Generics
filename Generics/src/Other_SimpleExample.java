public class Other_SimpleExample {

    public static void main(String[] args) {

        Other_SimpleExample otherSimpleExample=new Other_SimpleExample();

        boolean resultado= otherSimpleExample.areEqual(10,10);
        System.out.println(resultado);

        boolean res=otherSimpleExample.areEqual("Hugo","Valeria");
        System.out.println(res);
    }

    public <T>boolean areEqual(T x, T y){
            return x==y;
    }

}
