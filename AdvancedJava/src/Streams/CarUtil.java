package Streams;

import java.util.List;
import java.util.function.Predicate;

public class CarUtil {
    void nameCheck(Predicate p, List<String> carNames){
        for (String name : carNames) {
            System.out.println(name + " = " + p.test(name));
        }
    }
}
