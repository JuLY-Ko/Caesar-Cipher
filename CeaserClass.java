package assignment1;
/**
 * 
 * @author Jungyeon Park
 *
 */
public class CeaserClass {
	
	
	private int shift;
	private String input;
	
	public CeaserClass()
	{
		this.input = input;
		this.shift = shift;
		
	}
	/**
	 * do encryption.
	 * get String type of input and store it char type array
	 * then compare every single letter to given alphabet array (Lower case and Upper case)
	 * then if the value  is the same, keep it to String.
	 * 
	 * @param input
	 * @param shift
	 * @return finalMessage
	 */
	
	public static String encryption (String input,int shift)
	{
		char nthLetter = ' ';
		char alphabetUpper[] = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
		char alphabetLower[] = "abcdefghijklmnopqrstuvwxyz".toCharArray();
		char specialLetter[] = "~!@#$%^&*()_+`1234567890{};',./<>?|".toCharArray();		
 		String finalMessage = new String();
 		
 		boolean isItLetter;
		
		char lowerCase;
		
		if (Character.isLowerCase(nthLetter))
		{
			lowerCase = 'a';
		}else
		{
			lowerCase = 'A';
		}
		
		//
		//boolean isItLetter = Character.isLetter(nthLetter) ;
		
		
			for (int i = 0; i < input.length();i ++)
			{
				nthLetter = input.charAt(i);
				isItLetter = false;
			
				
					for (int a =0; a < 26; a++)
					{
							if (nthLetter == alphabetUpper[a])
							{
								
								int index = a + shift;
								if (index > 26)
								{
									index = index-26;
								}
								char afterShift = (char) (index + lowerCase);
								afterShift = Character.toUpperCase(afterShift);
								finalMessage += afterShift; 
								isItLetter = true;
							} 
						
							else if(nthLetter == alphabetLower[a])
							{
								int index = a + shift;
								if (index > 26)
								{
									index = index-26;
								}
								char afterShift = (char)(index + lowerCase);
								afterShift = Character.toLowerCase(afterShift);
								finalMessage += afterShift;
								isItLetter = true;
							}
							
					}
					if (!isItLetter)
					{
						finalMessage += nthLetter;
					}
			
				
				
				
			}
			
			return finalMessage;
	
	}
		
		
	
	
	/**
	 * do decryption.
	 * get String type of input and store it char type array
	 * then compare every single letter to given alphabet array (Lower case and Upper case)
	 * then if the value  is the same, keep it to String.
	 * 
	 * @param input
	 * @param shift
	 * @return finalMessage
	 */
	public static String decryption (String input, int shift)
	{
		char nthLetter = ' ';
		char alphabetUpper[] = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
		char alphabetLower[] = "abcdefghijklmnopqrstuvwxyz".toCharArray();
 		String finalMessage = new String();
 		
 		
 		char lowerCase;
		
		if (Character.isLowerCase(nthLetter))
		{
			lowerCase = 'a';
		}else
		{
			lowerCase = 'A';
		}
		
		boolean isItLetter;
		
		for (int i = 0; i < input.length();i ++)
		{
			nthLetter = input.charAt(i);
			isItLetter = false;
			
			for (int a =0; a < 26; a++)
			{
					if (nthLetter == alphabetUpper[a])
					{
					
						int index = a - shift;
						if (index < 0)
						{
							index = index+26;
						}
						char afterShift = (char) (index + lowerCase);
						afterShift = Character.toUpperCase(afterShift);
						finalMessage += afterShift; 
						isItLetter = true;
					} 
					
					else if(nthLetter == alphabetLower[a])
					{
						int index = a +-shift;
						if (index <0)
						{
							index = index+26;
						}
						
						char afterShift = (char)(index + lowerCase);
						afterShift = Character.toLowerCase(afterShift);
						finalMessage += afterShift;
						isItLetter = true;
					}
				}
			
			if(!isItLetter)
			{
				finalMessage += nthLetter;
			}
 		
		
			
		}
		
		return finalMessage;
	}
}
