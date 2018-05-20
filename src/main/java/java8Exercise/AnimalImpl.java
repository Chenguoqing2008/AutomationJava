package java8Exercise;

public class AnimalImpl {

    public void evalanimal(AnimalAttribute animalAttribute){

        animalAttribute.sleep("dog");

    }

    public static void main(String[] args){

//        String s = "cat";
        AnimalImpl animal = new AnimalImpl();
        animal.evalanimal(new DogAttribute());
        animal.evalanimal((s)-> System.out.println("have a good sleep: " + s));

        //greetingFunction is a lambda express of voidpirnt interface type
        //match the lambda express in the right to the particular type in the left that is voidprint
        //they both have same method signature parameter in and output
       voidprint greetingFunction = () -> System.out.println("hello");


    }

    interface voidprint{

        void print();
    }
}
