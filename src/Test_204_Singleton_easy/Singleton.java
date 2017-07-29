package Test_204_Singleton_easy;

/**
 * Created by zmt on 2017/7/29.
 */
public class Singleton {

    private static Singleton singleton;

    public static Singleton getSingleton() {
        if(singleton == null){
            synchronized(Singleton.class){
                if(singleton == null){
                    singleton = new Singleton();
                }
            }
        }
        return singleton;
    }
}
