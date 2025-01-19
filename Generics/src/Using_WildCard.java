import java.util.ArrayList;
import java.util.List;

public class Using_WildCard {
    public static void main(String[] args) {

        List<String> stringList=new ArrayList<>();
        stringList.add("Hugo");
        stringList.add("Veronica");
        stringList.add("Daniel");
        stringList.add("Carolina");
        //add(stringList);
       // add2(stringList);
        System.out.println("------------------------------------------------");

        List<Integer> integerList=new ArrayList<>();
        integerList.add(50);
        integerList.add(20);
        integerList.add(30);
        integerList.add(100);
        add(integerList);
        add2(integerList);

        System.out.println("------------------------------------------------");

        List<Double> doubleList=new ArrayList<>();
        doubleList.add(2.5);
        doubleList.add(3.2);
        doubleList.add(1.1);
        doubleList.add(4.5);
        doubleList.add(7.5);
        add(doubleList);
        add2(doubleList);

    }

    public static void add(List<? extends Number> myList){
       for (Number list: myList){
           System.out.println(list);
       }
        //myList.add(5)
    }

    //example of generics in method
    public static <T extends Number> void  add2(List<T > myList){
        for (Number list: myList){
            System.out.println(list);
        }
    }
    public static <T extends Number> T  add3(List<T > myList){
        Integer x=1;

        for (Number list: myList){
            System.out.println(list);
        }
        //myList.add();
        return (T)Integer.valueOf(x);
    }
}
