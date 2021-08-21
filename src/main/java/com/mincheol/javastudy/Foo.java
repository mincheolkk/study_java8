package com.mincheol.javastudy;

import java.util.function.*;

public class Foo {

    public static void main(String[] args) {

       RunSomething runSomething = () -> {
           System.out.println("hello");
       };

        System.out.println("------------");
        runSomething.doIt();

//        Plus10 plus10 = new Plus10();
        // 위와 같은 결과
        Function<Integer, Integer> plus10 = (i) -> i + 10;
        System.out.println(plus10.apply(1));

        Function<Integer, Integer> multiply2 = (i) -> i * 2;

        Function<Integer, Integer> multyply2AndPlus10 = plus10.compose(multiply2);
        System.out.println(multyply2AndPlus10.apply(3));

        System.out.println(plus10.andThen(multiply2).apply(3));

        Consumer<Integer> printT = (i) -> System.out.println(i);
        printT.accept(100);

        Supplier<Integer> get10 = () -> 10;
        System.out.println(get10.get());

        BinaryOperator<Integer> sum = (a, b) -> a + b;
        System.out.println(sum.apply(1, 2));

        Foo foo = new Foo();
        foo.run();
    }

    private void run() {

        int baseNumber = 10;

        // 로컬 클래스
        class LocalClass {
            void printBaseNumber() {
                System.out.println(baseNumber);
            }
        }

        // 익명 클래스
        Consumer<Integer> integerConsumer = new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.println(baseNumber);
            }
        };

        // 람다
//        IntConsumer printInt = (baseNumber) -> {
//            System.out.println(baseNumber);
//        };

        // 람다는 람다를 감싸고 있는 scope 과 같은 scope 임
        // 에러 문구 : Variable 'baseNumber' is already defined in the scope

//        printInt.accept(10);
    }

}
