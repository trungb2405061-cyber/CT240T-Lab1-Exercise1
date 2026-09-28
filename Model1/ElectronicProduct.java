
import java.util.*;

public class ElectronicProduct extends Product implements Discountable {

	private int warrantyMonths;
	
    public ElectronicProduct() {
    }

    @Override
    public double calculateFinalPrice() {
        // TODO implement here
        return getPrice() * 1.10;
    }

    public void applyDiscount(double percent) {
        // TODO implement here
    	double newPrice = getPrice() * (1-percent/100.0);
    	setPrice(newPrice);
    }

}