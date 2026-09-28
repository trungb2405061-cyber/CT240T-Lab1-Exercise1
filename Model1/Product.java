
import java.util.*;

/**
 * 
 */
public abstract class Product {
    private String id;
    private String name;
    private double price;

    /**
     * Default constructor
     */
    public Product() {
    	
    }
    
    public void Product(String id, String name, double price) {
        // TODO implement here
    	this.id = id;
    	this.name = name;
    	this.price = price;
    }

    public abstract double calculateFinalPrice();

    public String getID() {
        // TODO implement here
        return id;
    }

    public void setID(String id) {
        // TODO implement here
    	this.id = id;
    }

    public String getName() {
        // TODO implement here
        return name;
    }

    public void setName(String name) {
        // TODO implement here
    	this.name = name;
    }

    public double getPrice() {
        // TODO implement here
        return price;
    }
    
    public void setPrice(double price) {
        // TODO implement here
    	this.price = price;
    }

}