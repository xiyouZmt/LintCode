## LintCode
### 408. <a href="http://lintcode.com/en/problem/add-binary/"> Add Binary (Easy) </a>
	
	package Test_408_AddBinary_easy;

	/**
	 * Created by zmt on 2017/6/27.
	 */
	public class AddBinary {
	    public static void main(String [] args){
	        System.out.println(addBinary("11", "1"));
	    }
	    public static String addBinary(String a, String b) {
	        // Write your code here
	        if(a != null && b != null){
	            StringBuilder builder = new StringBuilder();
	            if(!a.equals(b)){
	                int aLength = a.length();
	                int bLength = b.length();
	                for (int i = 0; i < Math.abs(aLength - bLength); i++) {
	                    builder.append("0");
	                }
	                if (aLength > bLength){
	                    builder.append(b);
	                    b = builder.toString();
	                } else {
	                    builder.append(a);
	                    a = builder.toString();
	                }
	            }
	            int carry = 0;
	            int plus;
	            int [] result = new int[a.length()];
	            for (int i = a.length() - 1; i >= 0 ; i--) {
	                plus = a.charAt(i) + b.charAt(i) - 96 + carry;
	                carry = plus / 2;
	                result[i] = plus % 2;
	            }
	            builder.delete(0, builder.length());
	            if (carry == 1){
	                builder.append(carry);
	            }
	            for(int i : result){
	                builder.append(i);
	            }
	            return builder.toString();
	        }
	        return null;
	    }
	}
