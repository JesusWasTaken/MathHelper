package utilityCalc;
import java.text.DecimalFormat;

public class Calculator {
	
	// surface calculator, rounded to 0.00
	public static String squareArea(double width, double height) {
		DecimalFormat format = new DecimalFormat();
		format.setDecimalSeparatorAlwaysShown(false);
		return format.format(Math.round((width * height)*100.0)/100.0);
	}
	
	public static String scaleDown(Double scale, Double entry) {
		DecimalFormat format = new DecimalFormat();
		format.setDecimalSeparatorAlwaysShown(false);
		return format.format((entry / scale) * 100);
	}
	
	public static String scaleUp(Double scale, Double entry) {
		DecimalFormat format = new DecimalFormat();
		format.setDecimalSeparatorAlwaysShown(false);
		return format.format((entry * scale) / 100);
	}
	
}
