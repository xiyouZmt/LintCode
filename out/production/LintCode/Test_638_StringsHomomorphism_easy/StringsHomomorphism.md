## LintCode
### 638. <a href="http://www.lintcode.com/zh-cn/problem/strings-homomorphism/"> Strings Homomorphism (Easy) </a>

```java

package Test_638_StringsHomomorphism_easy;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zmt on 2017/7/24.
 */
public class StringsHomomorphism {
    public static void main(String [] args){
        String s = "a`%ii,VEZQc_BSU%ObO5<sX81B/bOw+CNUd#Uav*P!Ax!#>hh,k#b/|>4ixFQZl+l!?bJjakbQbGglEb<g>Hf81m@A9GIvbd]qh?y__t+E(Iyv7zUEfZF{81VaM-0u?]tG=_fFR/XJ=X{-,oRpxE9u*VNYlM";
        String t = "b`%ii-WE[Qc_BSV%OcO5<sX82B/cOw+CNVd#Vbv*P!Bx!#?hh-k#c/|?4ixFQ[l+l!?cJkbkcQcGhlEc<h?Hf82m@B9GIvcd]rh?y__t+E(Iyv7{VEf[F{82WbN/0u?]tG=_fFR/XJ=X{/-oRpxE9u*WNYlN";
        System.out.println(isIsomorphic(s, t));
    }
    public static boolean isIsomorphic(String s, String t) {
        // Write your code here
        boolean result = true;
        if(s == null || t == null){
            return false;
        }
        if(s.length() != t.length()){
            return false;
        }
        List<Character> list = new ArrayList<>();
        List<Character> list2 = new ArrayList<>();
        char target;
        for(int i = 0; i < s.length(); i++){
            target = s.charAt(i);
            if(list.contains(target)){
                int first = s.indexOf(target);
                if(t.charAt(i) != t.charAt(first)){
                    result = false;
                }
            } else {
                list.add(target);
            }

            target = t.charAt(i);
            if(list2.contains(target)){
                int first = t.indexOf(target);
                if(s.charAt(i) != s.charAt(first)){
                    result = false;
                }
            } else {
                list2.add(target);
            }
        }
        return result;
    }
}

```