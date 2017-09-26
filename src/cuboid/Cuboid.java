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
 * Modify your generic class Cuboid so that it only accepts Numbers. 
 * Add a method with the following definition and complete its body. 
 * Hint: Look at the method doubleValue() in the Number class.
 *      public double getVolume(){ ...... }
 */

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuboid;

/**
 *
 * @author cplummer
 */
public class Cuboid<T extends Number> {
    private T length;
    private T height;
    private T width;
    public Cuboid() {
    }

    public Cuboid(T length, T height, T width) {
        this.length = length;
        this.height = height;
        this.width = width;
    }

    public Cuboid(T length, T height) {
        this.length = length;
        this.height = height;
    }
    
    
    
    public T getLength(){return length;}
    public void setLength(T length){this.length = length;}
    
    public T getWidth(){return width;}
    public void setWidth(T width){this.width = width;}
    
    public T getHeight(){return height;}
    public void setHeight(T height){this.height = height;}
    
    public double getVolume(){return height.doubleValue()*width.doubleValue()*length.doubleValue();}
    
    public String toString()
    {
        return length.toString() + " " + height.toString() + " " + width.toString();
    }
}
