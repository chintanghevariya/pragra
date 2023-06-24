package org.example;
import lombok.*;

import java.util.logging.Logger;

@Data
@AllArgsConstructor
@RequiredArgsConstructor
@ToString
@EqualsAndHashCode

public class TestLombok {
    public String name;
    public String email;
    public String password;
    public String address;
    public int age;

    public static void showLogs(String name){
        System.out.println(Logger.getLogger("Logging " + name));
    }
}
