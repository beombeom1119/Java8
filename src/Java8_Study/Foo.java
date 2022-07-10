package Java8_Study;

import java.util.function.Predicate;
import java.util.function.Supplier;

public class Foo {


    public static void main(String[] args) {

        Predicate<String> startwithBeem = (s) -> s.startsWith("beom");

////        RunSomething runSomething = (number)-> number+10;
//        RunSomething runSomething = new RunSomething() {
//            int basenumber =10;
//
//            @Override
//            public int doit(int number) {
//                return number + basenumber;
//            }
//        };
//    }
//        Supplier<Integer> get10 = () -> 10;
//        System.out.println(get10.get());






    }
}
