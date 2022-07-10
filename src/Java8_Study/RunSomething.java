package Java8_Study;


@FunctionalInterface
public interface RunSomething {

//    abstract void doit();           /// 추상 메소드에서 abstract 빼도 된다.
     int doit(int number);

//    void doitnow();
//
//    static void printName() {
//        System.out.println("hello");
//    }
//
//    default void printAge()
//    {
//        System.out.println("26");
//    }
}
