package com.mincheol.javastudy;

@FunctionalInterface
public interface RunSomething   {

    void doIt();  // 추상 메소드(abstract는 생략가능) 가 하나면 있으면, 함수형 인터페이스

    // 두개 있으면 함수형 인터페이스가 아님
//    void doItAgain();

    // 함수형 인터페이스를 결정할 때, 다른 형태의 메소드가 몇 개 있는지는 중요하지 않다.
//    static void printName() {
//        System.out.println("Mincheol");
//    }
//
//    default void printAge() {
//        System.out.println("30");
//    }

}
