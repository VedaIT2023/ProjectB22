package com.vedait.polymorphism;
import java.util.HashMap;
public class Corporate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,String>corporateCode=new HashMap();
		corporateCode.put("OOO","Out of office");
		corporateCode.put("MoM", "Month over month");
		corporateCode.put("CPU", " Cost per unit");
		corporateCode.put("YTD", "Year to date");
		corporateCode.put("LIFO", "Year to date");
		corporateCode.put("HTML", " HyperText markup language");
		corporateCode.put("BID","Break it down");
		corporateCode.put("OS", "Operating system");
		corporateCode.put("PV", "Page view");
		corporateCode.put("COB","Close of business");
		corporateCode.put("EOD", "End of day");
		corporateCode.put("EOT", "End of thread");
		corporateCode.put("EOW", "End of week");
		corporateCode.put("FTE", "Full-time employee");
		corporateCode.put("IAM","In a meeting");
		
		String[] corporateName = {"OOO", "MoM", "CPU", "YTD", "LIFO", "HTML", "BID", "OS",
				"PV", "COB", "EOD", "EOT", "EOW", "FTE", "IAM"};

        
		for (String code : corporateName) {
            System.out.println(corporateCode.get(code));
        }


	}

}
