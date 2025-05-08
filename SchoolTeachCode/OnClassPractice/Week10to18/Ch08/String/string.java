package Week10to18.Ch08.String;

public class string {
	public static void main(String[] args) {
		String str1 = new String("Hello FCU~");
		String str2 = new String("Hello FCU~");
		String str3 = str1;
		String str4 = new String(str1);
		System.out.println("str1==str2:" + (str1 == str2));
		System.out.println("str1==str3:" + (str1 == str3));
		System.out.println("str1==str4:" + (str1 == str4));
		System.out.println("(比較字串內容)str1.equals(str2):" + (str1.equals(str2)));
		System.out.println("(比較字串內容)str1.equals(str3):" + (str1.equals(str3)));
		System.out.println("(比較字串內容)str1.equals(str4):" + (str1.equals(str4)));
		//變量1.equals(變量2)，比較字串內容


		String str5 = new String("Hello FCU~");
		String str6 = "   Hello FCU~          ";
		String str7 = "   Hello FCU~";
		System.out.println("str6==str7:" + (str6 == str7));//true
		System.out.println("str6==str5:" + (str6 == str5));
		System.out.println("(比較字串內容)str6.equals(str5):" + (str6.equals(str5)));

		int num =4;
		String str8 =str6+1+2+3;
		String str9=str6+num;
		System.out.println(str9);
		System.out.println(str8);

		boolean flag= true;
		String str10=str6+flag;
		System.out.println(str10);
		System.out.println(str10.length());
		String str11=str6.replace("l","L");
		System.out.println(str11);
		String str12="  ";
		System.out.println(str12.isEmpty());
		System.out.println(str12.isBlank());

		System.out.println(str6.substring(3, 6));//lo
		System.out.println(str6.substring(3));

		System.out.println(str6.trim());
		System.out.println(str7);

		StringBuffer sb = new StringBuffer();
		sb.append("HEllo");
		sb.append(" ");
		sb.append("FCU");
		sb.append("!!!!!!!!!!!!");
		System.out.println(sb.toString());


	}
}
