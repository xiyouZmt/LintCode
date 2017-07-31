## LintCode
### 454. <a href="http://www.lintcode.com/en/problem/rectangle-area/"> Rectangle Area (Easy) </a>

```java

package Test_454_RectangleArea_easy;

/**
 * Created by zmt on 2017/7/29.
 */
public class RectangleArea {
    public static void main(String [] args){

    }
    public int width;
    public int height;

    /*
     * Define a constructor which expects two parameters width and height here.
     */
    // write your code here
    public RectangleArea(int width, int height){
        this.width = width;
        this.height = height;
    }

    /*
     * Define a public method `getArea` which can calculate the area of the
     * rectangle and return.
     */
    // write your code here
    public int getArea(){
        return width * height;
    }
}

```