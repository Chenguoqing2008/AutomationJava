package java8Exercise;

import org.junit.Test;
import org.w3c.dom.events.EventException;

import java.util.Optional;

public class OptionalTest {

    @Test
    public void optionalbasic(){

        Optional<String> optional = Optional.of("DesignPattern/OpenClosePrinciple/girlsshoes/akdk/test");

        System.out.println(optional.get());

        System.out.println(optional.toString());

        System.out.println(optional.filter((t)->t.startsWith("a")).isPresent());
        System.out.println(optional.filter((t)->t.startsWith("t")).isPresent());

        Optional<String> optional1 = Optional.empty();
        System.out.println(optional1.orElse("hello"));

        System.out.println(optional1.orElseGet(()->"supplier test"));
        System.out.println(optional1.orElseThrow(()->new EventException((short) 1,"YOU EXCEPTION")));


    }
}
