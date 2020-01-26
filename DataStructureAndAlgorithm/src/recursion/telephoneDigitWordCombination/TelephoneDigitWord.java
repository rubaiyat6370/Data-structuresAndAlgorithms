/**
 * 
 */
package recursion.telephoneDigitWordCombination;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Rubaiyat
 *
 */
public class TelephoneDigitWord {
 
	private String input;
	private String[] list = { "ABC", "DEF", "GHI", "JKL", "MNO", "PRS", "TUV", "WXY"};
	public static void main(String[] args) {
		TelephoneDigitWord tg = new TelephoneDigitWord();
		tg.DigitToWord("6139297719");

	}
	
	public void DigitToWord(String str) {
		this.input = str;
		combination(0,new StringBuilder());
	}
	
	public void combination(int starti, StringBuilder sb) {
		if(sb.toString().length() == input.length()) {
			this.print(sb.toString());
			return;
		}
		
		for(int i = starti; i<input.length();i++) {
			if(input.charAt(i)!='1' && input.charAt(i)!='0') {
				for(int j=0;j<3;j++) {
					int pos = input.charAt(i) - '0';
					sb.append(list[pos-2].charAt(j));
					combination(i+1,sb);
					sb.setLength(sb.length()-1);
				}
			} else {
				sb.append(input.charAt(i));
				combination(i+1, sb);
				sb.setLength(sb.length()-1);
			}
		}
	}
	
	private <T> void print(T value){
		System.out.println(value);
	}


}