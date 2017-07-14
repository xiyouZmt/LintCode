## LintCode
### 445. <a href="http://www.lintcode.com/en/problem/cosine-similarity/"> Cosine Similarity (Easy) </a>

```java

package Test_445_CosineSimilarity_easy;

/**
 * Created by zmt on 2017/7/14.
 */
public class CosineSimilarity {
    public static void main(String [] args){
        int [] A = {1,2,3};
        int [] B = {2,3,4};
        System.out.println(cosineSimilarity(A, B));
    }

    public static double cosineSimilarity(int[] A, int[] B) {
        // write your code here
        if(A == null || B == null){
            return -1;
        }
        if(A.length == 0 || B.length == 0){
            return (double)2;
        }
        double denominator = denominator(A) * denominator(B);
        if(denominator == 0){
            return (double)2;
        }
        return numerator(A, B) / denominator;
    }
    public static int numerator(int [] A, int [] B){
        if(A == null || B == null){
            return -1;
        }
        int numerator = 0;
        for (int i = 0; i < A.length; i++) {
            numerator += A[i] * B[i];
        }
        return numerator;
    }
    public static double denominator(int [] A){
        if(A == null ){
            return -1;
        }
        int denominator = 0;
        for (int i = 0; i < A.length; i++) {
            denominator += A[i] * A[i];
        }
        return Math.pow(denominator, 0.5);
    }

}

```