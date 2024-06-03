import java.util.HashMap;
import java.util.Map;

public class HelloClass {

	public static void main(String[] args) 
	{
		Map<Integer, String> lakers = new HashMap<Integer, String>();
		
		//Keys and Values
		lakers.put(6, "Lebron James");
		lakers.put(0, "Shaquille Harrison");
		lakers.put(14, "Scotty Pippen Jr");
		
		
		replacePlayer(lakers,6,"Moloko Magwai");
		
//		//Removing an object by its key
		removePlayerByKey(lakers, 0);
//		
//		//Removing all of them
		removeAllPlayers(lakers);
		  
		
		
		PutPlayer(lakers, 7, "Moloko Magwai");
		PutPlayer(lakers, 11, "Kyrie Irving");
		System.out.println(isValueThere(lakers,"Moloko Magwai"));
		
		//Looping through all Objects for specific Use
		for(Map.Entry m: lakers.entrySet())
		{
			System.out.println(m.getKey() + " " + m.getValue());
		}

	}
	public static void PutPlayer(Map<Integer, String> team, int Key, String Value)
	{
		team.put(Key, Value);
	}
	public static boolean isValueThere(Map<Integer, String> team , String value)
	{		
		return team.containsValue(value);
	}
	
	public static void removePlayerByKey(Map<Integer, String> team, int index)
	{
		team.remove(index);
	}
	
	public static void removeAllPlayers(Map<Integer, String> team)
	{
		team.clear();
	}
	
	public static void replacePlayer(Map<Integer,String> team, int Key, String Value)
	{
		team.replace(Key,Value);
	}

}
