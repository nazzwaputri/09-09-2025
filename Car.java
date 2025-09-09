public class Car {
    //property class
    int numDoors;
    boolean isElectric;

    //constructor
    /**
     * 
     */
    public Car(){
        numDoors = 29;
        isElectric =true;
}
public Car (int numDoors, boolean isElectric){
    this.numDoors = numDoors;
    this.isElectric = isElectric;
}
    //getter
    //setter
    //method
    public void print(){
        System.out.println("NumDoors: " + numDoors);
        System.out.println("IsElectric: " + isElectric);
    }
}