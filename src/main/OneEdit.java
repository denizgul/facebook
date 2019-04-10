import java.util.Arrays;

/**
 * Write a function to return if two words are exactly "one edit" away, where an edit is:
 * Inserting one character anywhere in the word (including at the beginning and end)
 * Removing one character
 * Replacing exactly one character
 * 
 * Test Cases
	OneEditApart("cat", "dog") = false 
	OneEditApart("cat", "cats") = true
	OneEditApart("cat", "cut") = true
	OneEditApart("cat", "cast") = true --->bunda calısmıyor
	OneEditApart("cat", "at") = true
	OneEditApart("cat", "act") = false ---->bunda calısmıyor.
 */
public class OneEdit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(OneEditApart("cat", "act"));
	}

	public static boolean OneEditApart(String w1, String w2) {
		
		char[] word1= w1.trim().toCharArray();
		char[] word2 = w2.trim().toCharArray();

		int length1=word1.length;
		int length2=word2.length;

		if(Math.abs(length2-length1) > 1) return false;

		Arrays.sort(word1);
		Arrays.sort(word2);

		int length = word1.length >= word2.length? word2.length:word1.length; //take the minimum length

		int falseCounter=0;
		for(int i=0; i < length; i++ ) {
			if(word1[i] != word2[i] && ++falseCounter > 1){
				return false;
			}
		}

		return true;


	}
	
}
