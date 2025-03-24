package day6;

public class Program1 {
public static String capitalise(String sentence)
{
	String[] words=sentence.split(" ");
	StringBuilder result = new StringBuilder();
	for(String word:words)
	{
		if(word.length()>0)
		{
			result.append(Character.toUpperCase(word.charAt(0))+word.substring(1).toLowerCase()).append(" ");
			
		}
	}
	return result.toString().trim();
}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input="Now is the time to act!";
		String output=capitalise(input);
		System.out.println(output);

	}

	

}
