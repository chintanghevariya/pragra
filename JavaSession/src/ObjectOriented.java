public class ObjectOriented {
    public static void main(String[] args) {
        Student sam = new Student();
        Student chintan = new Student();

        sam.firstName = "chintan";
        sam.lastName = "ghevariya";
        sam.age = 22;
        sam.stuId = 1;
        sam.school = "George Brown College";
        sam.study();

        chintan = sam; // will refer to the same memory location for data.
        System.out.println(chintan); // will print memory location for object.
        chintan.study();


    }
}
