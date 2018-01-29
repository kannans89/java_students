import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import com.techlabs.patterns.behavioural.stratergy.IDiscountStratergy;
import com.techlabs.patterns.behavioural.stratergy.Invoice;
import com.techlabs.patterns.behavioural.stratergy.NormalDiscount;


public class Test {

	public static void main(String[] args) {

		
		Properties props=new Properties();
		try {
			props.load(new FileInputStream("states.properties"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String value=(String)props.get("Stratergy");
		if(value.equals("normal"))
		{
		IDiscountStratergy stratergy=new NormalDiscount();
		Invoice invoice=new Invoice("vaibhavi",5000,stratergy);
		System.out.println(invoice.calculateTotal());
		}
	}

}
