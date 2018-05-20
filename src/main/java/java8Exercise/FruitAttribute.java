package java8Exercise;

@FunctionalInterface
public interface FruitAttribute {

    public void taste();   // can only have one abstract method.

    default void getweight(){
        System.out.println("hello weigh");
    }
//    public void getweight();
}
