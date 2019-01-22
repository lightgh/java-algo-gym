import static java.lang.System.out;
import java.util.HashMap;
import java.util.Map;

public class Day6{



	public static void main(String[] args){
		String a = "I am coming back to the terminal";
		// String b = new String(a);

		String b = new String(a);

		out.println(a.charAt(0));
		
		if(b.equals(a)){
		
		// if(b == (a)){
		out.println("They are the same");

		}else{
			out.println("They are not the same");
		}

		
		HashMap<String, String> myMap = new HashMap<>();

		myMap.put("fname", "Light");
		myMap.put("lname", "Chinaka");
		myMap.put("address", "Federal Polytechnic Bauchi");
		myMap.put("system", "Dell Inpirion 14 7000 series");
		myMap.put("friend1", "Calistus Amefo");
		myMap.put("friend2", "Godson C Chibuikem");

		out.println("The Size: " +myMap.size());

		
		
	}

}
