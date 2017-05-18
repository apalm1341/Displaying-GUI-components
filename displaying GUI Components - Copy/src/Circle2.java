
public class Circle2 {
  //radius of circle
  double radius;

  //the number of objects created
  static int numberOfObjects = 0;

  // Here's the entry point
  public static void main(String[] args) {
    // Just a message to our standard out
    System.out.println("Hello World.");
    // Create an instance of the Circle2 class.
    Circle2 myCircle = new Circle2(5);
    // numberOfObjects (should) have increased by now, so this should be 1 circle.
    System.out.println("There are " + Circle2.numberOfObjects + " circles created!");
    // And now we get the area of it. which is around 70.5 for a radius of 5.
    System.out.println("myCircle has an area of " + myCircle.getArea());
  }

  //construct a circle with radius 1
  Circle2() {
    radius = 1.0;
    numberOfObjects++;
  }

  //construct a circle with specified radius
  Circle2(double newRadius) {
    radius = newRadius;
    numberOfObjects++;
  }

  //Return numberOfObjects
  static int getNumberOfObjects() {
    return numberOfObjects;
  }

  //return the area of this circle
  double getArea() {
    return radius * radius * Math.PI;
  }
}









































/*public class Circle2 {
  //radius of circle
  double radius;
  
  //the number of objects created
  static int numberOfObjects = 0;
  
  public static void main(String[] args) {
    // If you just need a main method.
    System.out.println("Hello World.");
    myCircle = new Circle2(5);
    System.out.println("There are " + Circle2.numberOfObjects + " circles created!");
    System.out.println("myCircle has an area of " myCircle.getArea());
  }
  
  //construct a circle with radius 1
  Circle2() {
    radius = 1.0;
    numberOfObjects++;
  }
  
  //construct a circle with specified radius
  Circle2(double newRadius) {
    radius = newRadius;
    numberOfObjects++;
  }
  
  //Return numberOfObjects
  static int getNumberOfObjects() {
    return numberOfObjects;
  }
  
  //return the area of this circle
  double getArea() {
    return radius * radius * Math.PI;
  }
}*/































/*public class Circle2 {
	
	public static void main(String[] args) {
	//radius of circle
	double radius;
	
	//the number of objects created
	static int numberOfObjects = 0;
	
	//construct a circle with radius 1
	Circle2() {
		radius = 1.0;
		numberOfObjects++;
	}
	
	//construct a circle with specified radius
	Circle2(double newRadius) {
		radius = newRadius;
		numberOfObjects++;
	}
	
	//Return numberOfObjects
	static int getNumberOfObjects() {
		return numberOfObjects;
	}
	
	//return the area of this circle
	double getArea() {
		return radius * radius * Math.PI;
		}
	}

}*/

