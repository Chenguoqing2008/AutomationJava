package java8Exercise;

public class FruiteImplement {

    public  void getTaste(FruitAttribute fruitAttribute){

//        @Override
                fruitAttribute.taste();

    }

    public static void main(String[] args){

        FruitAttribute a = ()-> System.out.println("it is sweet.");

        FruiteImplement fruiteImplement = new FruiteImplement();
        fruiteImplement.getTaste(a);

    }
}
