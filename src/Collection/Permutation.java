package Collection;

/**
 * Created by zmt on 2017/9/2.
 */
public class Permutation {
    private static StringBuilder builder = new StringBuilder();
    public static void main(String [] args){
        permutation("abc", 0);
    }

    private static void permutation(String str, int index){
        if(str == null || index >= str.length()){
            return ;
        }
        if(builder.toString().equals("")){          /** 恢复到上一次交换时的字符串 */
            builder.append(str);
        }
        for (int i = index; i < str.length(); i++) {
            for (int j = i + 1; j < str.length(); j++) {
                char start = builder.charAt(i);
                char temp = builder.charAt(j);
                builder.deleteCharAt(i);
                builder.insert(i, temp);
                builder.deleteCharAt(j);
                builder.insert(j, start);
                System.out.println(builder.toString());

                permutation(builder.toString(), index + 1);

                builder.delete(0, builder.length());
                builder.append(str);
            }
        }
    }
}
