public class Honda {
    String nameOfCar;
    int year;
    Honda(String nameOfCar, int year){
        this.nameOfCar = nameOfCar;
        this.year = year;
    }
    String drive(){
        return "I am driving "+ this.nameOfCar + " " + this.year;
    }
}
