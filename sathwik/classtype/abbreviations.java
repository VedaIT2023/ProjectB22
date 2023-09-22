package classtype;
import java.util.*;

public class abbreviations {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Abbreviation :");
        String abbreviation = sc.nextLine().toUpperCase();

        HashMap<String, String> abre = new HashMap<>();
        abre.put("ASAP", "As soon as possible");
        abre.put("IMO","In my opinion");
        abre.put("DIY","Do-it-yourself");
        abre.put("LOL","Laugh out loud");
        abre.put("LMK","Let me know");
        abre.put("OMW","On my way");
        abre.put("BRB","Be right back");
        abre.put("OMG","Oh my god");
        abre.put("WFH","Work from home");
        abre.put("CEO","Chief Executive Officer");
        abre.put("AIDS","Acquired Immune Deficiency Syndrome");
        abre.put("AIIMS","All India Institute of Medical Sciences");
        abre.put("BSE","Bombay Stock Exchange");
        abre.put("CPI","Communist Party of India");
        abre.put("DRAM","Dynamic Random Access Memory");
        abre.put("EMI","Equated Monthly Installment");
        abre.put("FSSA","Food Safety and Standards Authority (of India)");
        abre.put("GST","Goods and Service Tax");
        abre.put("GOOGLE","Global Organisation Of Oriented Group Language of Earth");
        abre.put("GPRS","General Packet Radio System");
        abre.put("HTML","HyperText Markup Language");
        abre.put("HTTP","Hypertext Transfer Protocol");
        abre.put("IFC","International Finance Corporation");
        abre.put("KYC","Know your customer");
        abre.put("LASER","Light Amplification by Stimulated Emission of Radiation");
        abre.put("MRI","Magnetic Resonance Imaging");
        abre.put("NSE","National Stock Exchange");
        abre.put("PTO","Please Turn Over");
        abre.put("LTE","Long Term Evaluation");
        abre.put("USB", "Universal Serial Bus");
        abre.put("PDF", "Portable Document Format");
        abre.put("GPS", "Global Positioning System");
        abre.put("WiFi", "Wireless Fidelity");
        abre.put("CPU", "Central Processing Unit");
        abre.put("RAM", "Random Access Memory");
        abre.put("FBI", "Federal Bureau of Investigation");
        abre.put("NASA", "National Aeronautics and Space Administration");
        abre.put("UNESCO", "United Nations Educational, Scientific and Cultural Organization");
        abre.put("NATO", "North Atlantic Treaty Organization");

        String fullForm = abre.get(abbreviation);
        if (fullForm != null) {
            System.out.println("Full Form: " + fullForm);
        } else {
            System.out.println("Abbreviation not found");
        }
    }
}
