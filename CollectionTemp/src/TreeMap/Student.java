package TreeMap;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@AllArgsConstructor
@Data
@Builder
public class Student implements Comparable<Student> {
    //final means it's considering in RequirementArgsConstructor
    final String name, school;
    Integer age; // Wrapper class

    //return 0 if both objects are equal
    //return positive,  1 if current object is larger
    //return negative, -1 if current object is smaller
    //Comparator -> function interface / alternative of comparable.
    @Override
    public int compareTo(Student student) {
        //return this.name.compareTo(student.name);
        //return this.age.compareTo(student.age);
            if(this.age == student.age)
                return 0;
            else if(this.age > student.age){
                return 1;
            }else{
                return -1;
            }

    }


}
