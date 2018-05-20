package java8Exercise;

public class DogAttribute implements  AnimalAttribute {

    @Override
    public void sleep(String animaltype) {
        System.out.println("Have a good sleep: " + animaltype);
    }


}
