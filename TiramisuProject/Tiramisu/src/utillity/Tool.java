package utillity;

public class Tool {
	public static String toKSC5601(String s) {
		if (s == null) {
			return null;
		}
		try {
			return new String(s.getBytes("8859_1"), "KSC5601");
		} catch (Exception e) {
			return s;
		}
	}
}