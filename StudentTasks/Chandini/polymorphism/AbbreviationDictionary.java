package polymorphism;
import java.util.*;
public class AbbreviationDictionary {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        Map<String, String> abbreviationMap = new HashMap<>();
        abbreviationMap.put("LOL", "Laugh Out Loud");
        abbreviationMap.put("BRB", "Be Right Back");
        abbreviationMap.put("IDK", "I Don't Know");
        abbreviationMap.put("FYI", "For Your Information");
        abbreviationMap.put("CEO", "Chief Executive Officer");
        abbreviationMap.put("CTO", "Chief Technology Officer");
        abbreviationMap.put("CFO", "Chief Financial Officer");
        abbreviationMap.put("ASAP", "As Soon As Possible");
        abbreviationMap.put("DIY", "Do It Yourself");
        abbreviationMap.put("FAQ", "Frequently Asked Questions");
        abbreviationMap.put("GPS", "Global Positioning System");
        abbreviationMap.put("HTML", "HyperText Markup Language");
        abbreviationMap.put("HTTP", "Hypertext Transfer Protocol");
        abbreviationMap.put("IMAX", "Image Maximum");
        abbreviationMap.put("JPEG", "Joint Photographic Experts Group");
        abbreviationMap.put("LCD", "Liquid Crystal Display");
        abbreviationMap.put("PDF", "Portable Document Format");
        abbreviationMap.put("RAM", "Random Access Memory");
        abbreviationMap.put("SMS", "Short Message Service");
        abbreviationMap.put("USB", "Universal Serial Bus");
        abbreviationMap.put("WiFi", "Wireless Fidelity");
        abbreviationMap.put("ATM", "Automated Teller Machine");
        abbreviationMap.put("B2B", "Business-to-Business");
        abbreviationMap.put("FOMO", "Fear Of Missing Out");
        abbreviationMap.put("HR", "Human Resources");
        abbreviationMap.put("IQ", "Intelligence Quotient");
        abbreviationMap.put("KPI", "Key Performance Indicator");
        abbreviationMap.put("VPN", "Virtual Private Network");
        abbreviationMap.put("WWW", "World Wide Web");
        abbreviationMap.put("UFO", "Unidentified Flying Object");
        abbreviationMap.put("NASA", "National Aeronautics and Space Administration");
        abbreviationMap.put("AI", "Artificial Intelligence");
        abbreviationMap.put("DIY", "Do It Yourself");
        abbreviationMap.put("TGIF", "Thank God It's Friday");
        abbreviationMap.put("NDA", "Non-Disclosure Agreement");
        abbreviationMap.put("TV", "Television");
        abbreviationMap.put("DVD", "Digital Versatile Disc");
        abbreviationMap.put("CEO", "Chief Executive Officer");
        abbreviationMap.put("ICU", "Intensive Care Unit");
        abbreviationMap.put("FAQ", "Frequently Asked Questions");
        abbreviationMap.put("FDA", "Food and Drug Administration");
        abbreviationMap.put("IRS", "Internal Revenue Service");
        abbreviationMap.put("JPEG", "Joint Photographic Experts Group");
        abbreviationMap.put("NATO", "North Atlantic Treaty Organization");
        abbreviationMap.put("OPEC", "Organization of the Petroleum Exporting Countries");
        abbreviationMap.put("UNICEF", "United Nations International Children's Emergency Fund");
        abbreviationMap.put("VIP", "Very Important Person");
        abbreviationMap.put("NASA", "National Aeronautics and Space Administration");
        System.out.println("Enter short form to print abbreviation :");
        String abbreviation = sc.nextLine().toUpperCase();
        if (abbreviationMap.containsKey(abbreviation)) {
            String fullForm = abbreviationMap.get(abbreviation);
            System.out.println(abbreviation + " stands for " + fullForm);
        } else {
            System.out.println("Abbreviation not found.");
        }
    }
}
