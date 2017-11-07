package p03.dataTypes;

public class DataType4Example {

	   public static void main(String[] args) {
		      boolean varb = true;
		      byte var_byte = 127;
		      short var_short = 32767;
		      char var_char1 = 66;
		      System.out.println(var_char1);
		      char var_char2 = 'a';
		      char var_char31 = '가';
		      char var_char32 = '\uac00'; //u해당 unicode를 입력해도 동일한 결과가 나옴
		      System.out.println("var_char31=" + var_char31);
		      System.out.println("var_char32=" + var_char32);

		      System.out.println("한글");
		      System.out.println('\ud55c');
		      System.out.println('\uae00');

		   }
}
