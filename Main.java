class Car {
      String brand;
      String color;
      int year; 
      int maxSpeed;

      // constructor
      public Car(String brand, String color, int year, int maxSpeed){
        this.brand = brand;
        this.color = color;
        this.year = year;
        this.maxSpeed = maxSpeed;
      }
}

public class Main {
	public static void main(String[] args) {

    // Car mustang = new Car();
    // mustang.brand = "ford";
    // System.out.println(mustang.brand); 

    Car gtr = new Car("Nissan", "red", 2020, 200);
    String output = String.format("This %d %s gtr is %s and it goes %d mph.", gtr.year, gtr.brand, gtr.color, gtr.maxSpeed);
    System.out.println(output);
	}
}