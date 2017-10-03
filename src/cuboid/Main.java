/*
 * STEP1:
 * Create a generic class called Cuboid that will store the three dimensions of a cuboid. 
 * Add methods to set and get the length, breadth and Height. 
 * Add a method public String toString() that will return all of the dimensions. 
 * The type of the dimensions will be decided at construction of the cuboid instance. 
 * Example:
 *      Cuboid<Double> c1 = new Cuboid<>();
 *      Cuboid<String> c1 = new Cuboid<>();
 *   
 * STEP 2:
 * Modify your generic class Cuboid so that it only accepts Numbers. Add a method with the following definition and complete its body. Hint: Look at the method doubleValue() in the Number class.
 *      public double getVolume(){ ...... }
 */
package cuboid;

/**
 *
 * @author cplummer
 * @email mail.caleb.plummer@gmail.com
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Add code here to fully test your Cuboid Class.
        //Be sure to test all constructors and methods.
        Cuboid<Double> cuboid1 = new Cuboid<>();
        cuboid1.setLength(10.5);
        cuboid1.setWidth(11.5);
        cuboid1.setHeight(12.5);
        
        Cuboid<Integer> cuboid2 = new Cuboid<>(1, 2, 3);
        System.out.println(cuboid1.toString());
        System.out.println(cuboid2.toString());
    }
    
}
