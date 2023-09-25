package Satish;
import java.util.*;
public class Abbreviations {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Abbreviation :");
        String abbreviation = sc.nextLine().toUpperCase();

        HashMap<String, String> abr = new HashMap<>();
        abr.put("ASAP", "As soon as possible");
        abr.put("IMO","In my opinion");
		abr.put("DIY","Do-it-yourself");
		abr.put("LOL","Laugh out loud");
		abr.put("LMK","Let me know");
		abr.put("OMW","On my way");
		abr.put("BRB","Be right back");
		abr.put("OMG","Oh my god");
		abr.put("WFH","Work from home");
		abr.put("CEO","Chief Executive Officer");
		abr.put("AIDS","Acquired Immune Deficiency Syndrome ");
		abr.put("AIIMS","All India Institute of Medical Sciences");
		abr.put("BSE","Bombay Stock Exchange");
		abr.put("CPI","Communist Party of India ");
		abr.put("DRAM","Dynamic Random Access Memory ");
		abr.put("EMI","Equated Monthly Instalment ");
		abr.put("FSSA","Food Safety and Standards Authority (of India)");
		abr.put("GST","Goods and Service Tax ");
		abr.put("GOOGLE","Global Organisation Of Oriented Group Language of Earth ");
		abr.put("GPRS","General Packet Radio System");
		abr.put("HTML","HyperText Markup Language");
		abr.put("HTTP","Hypertext Transfer Protocol ");
		abr.put("IFC","International Finance Corporation");
		abr.put("KYC"," Know your customer");
		abr.put("LASER","Light Amplification by Stimulated Emission of Radiation ");
		abr.put("MRI","Magnetic Resonance Imaging");
		abr.put("NSE"," National Stock Exchange ");
		abr.put("PTO","Please Turn Over");
		abr.put("LTE","Long Term Evalution");
        
        String fullForm = abr.get(abbreviation);
        if (fullForm != null) {
        	System.out.println("Full Form: " + fullForm);
        } else {
            
            System.out.println("Abbreviation not found");
        }

	}

}
