public class Generic_Class<T> {
    public static void main(String[] args) {

        Generic_Class<Integer> example1=new Generic_Class<>();
        boolean resultado=example1.areEqual(10,20);
        System.out.println(resultado);

        //puedes llamar a los metodos pero ojo deben ser "String" porque asi creaste el objeto
        Generic_Class<String> example2= new Generic_Class<>();
        boolean res1=example2.areEqual("Hugo","Valeria");
        System.out.println(res1);
        //
        boolean res2=example2.notEqual("Hugo","Hugo");
        System.out.println(res2);


    }

    public boolean areEqual(T x, T y){
        return x==y;
    }

    public boolean notEqual(T x, T y){
        return x!=y;
    }


}
