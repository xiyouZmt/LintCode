## LintCode
### 13. <a href="http://lintcode.com/problem/strstr"> strStr (Easy) </a>

	package Test_013_SearchStr_easy;

	/**
	 * Created by zmt on 2017/6/23.
	 */
	public class FindString {
	    public static void main(String [] args){
	        System.out.println(findString("abcdefg", "cdefg"));
	    }
	
	    public static int findString(String source, String target){
	        if(source == null || target == null){
	            return -1;
	        }
	        if(source.equals("") && target.equals("")){
	            return 0;
	        }
	        for (int i = 0; i < source.length(); i++) {
	            int end = i + target.length();
	            if(end <= source.length()){
	                String sub = source.substring(i, end);
	                if(sub.equals(target)){
	                    return i;
	                }
	            } else {
	                break;
	            }
	        }
	        return -1;
	    }
	}
