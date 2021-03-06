/**
 * 
 */
package recursion.telephoneDigitWordCombination;

/**
 * @author Rubaiyat
 *
 */
public class TelephoneDigitWord {
 
	private String input;
	private String[] list = { "ABC", "DEF", "GHI", "JKL", "MNO", "PRS", "TUV", "WXY"};
	public static void main(String[] args) {
		TelephoneDigitWord tg = new TelephoneDigitWord();
		tg.DigitToWord("4971927");

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
					sb.append(list[pos-2].charAt(j)); //the list for char 2 starts from 0
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
	//todo
	public void interative(StringBuilder sb) {
		for(int i = 0; i< input.length();i++) {
			for(int j = i;j<input.length();j++) {
				if(input.charAt(j)!='1' && input.charAt(j)!='0') {
					for(int k = 0;k<3;k++) {
						int pos = input.charAt(k) - '0';
						sb.append(list[pos-2]);
						sb.setLength(sb.length()-1);
					}
				} else {
					sb.append(input.charAt(i));
					sb.setLength(sb.length()-1);
				}
			}
		}
	}
	
	private <T> void print(T value){
		System.out.println(value);
	}


}
