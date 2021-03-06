package recursion.combination;

public class Combination {

	private String input;
	
	public static void main(String[] args) {
		Combination c = new Combination();
		c.getAllCombinationOf("ABCD");

	}
	
	public void getAllCombinationOf(String str) {
		input = str;
		combine(0,new StringBuilder());
	}
	
	public void combine(int start, StringBuilder sb) {
		
		for(int i = start; i<input.length();i++) {
			sb.append(input.charAt(i));
			this.print(sb.toString());
			if(start<input.length()) combine(i+1, sb);
			//this.print(sb.toString());
			sb.deleteCharAt(sb.length()-1);
		}
		
	}
	
	private <T> void print(T value){
		System.out.println(value);
	}

}
