public class HexString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(formatRGB(255,0,128));
	}
	
	public static String formatRGB(int a, int b, int c) {
		return toHex(a) + toHex(b) + toHex(c);
	}
	
	public static String toHex(int c) {
		return Integer.toHexString(c);
	}

}
