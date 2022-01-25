package utilityCalc;
import java.text.DecimalFormat;

public class BaseConverter {
	// tested
	public static String meterToCenti(double entry) {
		DecimalFormat format = new DecimalFormat();
		format.setDecimalSeparatorAlwaysShown(false);
		return format.format(entry * 100);
	}
	
	// tested
	public static String centiToMeter(double entry) {
		DecimalFormat format = new DecimalFormat();
		format.setDecimalSeparatorAlwaysShown(false);
		return format.format(entry / 100);
	}
	
}
