/**
 * Implement a function that outputs the Look and Say sequence:
1 
11
21
1211
111221
312211
13112221
1113213211
31131211131221
13211311123113112211
 * @author deniz.gul
 *This problem is fairly straightforward and should not take a long time to solve. 
 *However, be sure you do proper error checking of the input first! (Empty and invalid inputs should be taken into account). Additionally, you can ask yourself:
 *How does the ouput length scale?
 *What is the max single digit that can exist in the output?
 *What is the only starting sequence that never grows in length?
 */
public class LookAndSay {

	public static void main(String[] args) {
		lookAndSay("31131211131221");
	}
	
	//1113213211
	public static void lookAndSay(String sequence) {
		int counter = 1;
		StringBuilder say = new StringBuilder();
		int toCount = Character.getNumericValue(sequence.charAt(0));
		for(int i=1; i< sequence.length(); i++) {
			int ths = Character.getNumericValue(sequence.charAt(i));
			if(toCount == ths) {
				counter++;
			}else {
				say.append(counter).append(toCount);
				toCount = ths;
				counter=1;
			}
		}
		say.append(counter).append(toCount);
		System.out.println(say);
	}

}
