## LintCode
### 647. <a href="http://www.lintcode.com/zh-cn/problem/substring-anagrams/"> Substring Anagrams (Easy) </a>

```java

package Test_647_SubstringAnagrams_easy;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zmt on 2017/7/25.
 */
public class SubstringAnagrams {
    public static void main(String [] args){
//        String s;
//        StringBuilder builder1 = new StringBuilder();
//        StringBuilder builder2 = new StringBuilder();
//        try {
//            BufferedReader reader = new BufferedReader(new FileReader("E:\\Courses\\1.txt"));
//            while ((s = reader.readLine()) != null){
//                builder1.append(s);
//            }
//            reader.close();
//            BufferedReader reader1 = new BufferedReader(new FileReader("E:\\Courses\\2.txt"));
//            while ((s = reader1.readLine()) != null){
//                builder2.append(s);
//            }
//            reader1.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
        System.out.println(findAnagrams("cbaebabacd", "abc"));
    }

    public static List<Integer> findAnagrams(String s, String p) {
        // Write your code here
        List<Integer> list = new ArrayList<>();
        if(s == null || p == null){
            return list;
        }
        int index;
        int startPos = 0;
        boolean start = true;
        StringBuilder builder = new StringBuilder(p);
        for(int i = 0; i < s.length(); i++){
            if((index = builder.indexOf(s.charAt(i) + "")) >= 0){
                if(start){
                    startPos = i;
                    start = false;
                }
                builder.deleteCharAt(index);
                if(builder.length() == 0){
                    list.add(startPos);
                    if(i == s.length() - 1){
                        break;
                    }
                    if(p.contains(s.charAt(i + 1) + "")){       //下一字符包括在p中再回退(提高效率)
                        i = startPos;
                    }
                    builder.replace(0, builder.length(), p);
                    start = true;
                }
            } else {
                if(p.contains(s.charAt(i) + "")){     //当前字符包括在p中时回退(必须有)
                    i = startPos;
                }
                builder.replace(0, builder.length(), p);
                start = true;
            }
        }
        return list;
    }
}

```