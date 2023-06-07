
package Exercise;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.*;

@Data
@AllArgsConstructor
public class Team {
    String projectName;
    String features;
    String stakeholders;
    double budget;
    Date deadline;
}
