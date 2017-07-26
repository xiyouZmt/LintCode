package Test_109_Triangle_easy;

import java.util.HashMap;

/**
 * Created by zmt on 2017/7/26.
 */
public class Triangle {
    public static void main(String [] args){
//        int [][] triangle = {{10}};
//        System.out.println(minimumTotal(triangle));
        HashMap<Integer, Integer> map = new HashMap<>();
        System.out.println(map.get(2));
    }
    public static int minimumTotal(int[][] triangle) {
        // write your code here
        if (triangle == null || triangle.length == 0){
            return 0;
        }
        int length = triangle.length;
        int [][] min = new int[length][length];
        min[0][0] = triangle[0][0];
        for (int i = 1; i < length; i++){
            min[i][0] = triangle[i][0] + min[i - 1][0];
            min[i][i] = triangle[i][i] + min[i - 1][i - 1];
        }
        for(int i = 2; i < length; i++){
            for(int j = 1; j < triangle[i].length - 1; j++){
                min[i][j] = Math.min(min[i - 1][j], min[i - 1][j - 1]) + triangle[i][j];
            }
        }
        int result = min[length - 1][0];
        for(int i = 0; i < length; i++){
            if(min[length - 1][i] < result){
                result = min[length - 1][i];
            }
        }
        return result;
    }
}
