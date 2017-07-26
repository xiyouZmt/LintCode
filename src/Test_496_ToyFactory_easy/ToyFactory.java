package Test_496_ToyFactory_easy;

/**
 * Created by zmt on 2017/7/26.
 */
public class ToyFactory {
    public static void main(String [] args){
        Toy cat = getToy("Cat");
        cat.talk();
        Toy dog = getToy("dog");
        dog.talk();
    }
    public static Toy getToy(String type) {
        // Write your code here
        if(type == null){
            return null;
        }
        if(type.equalsIgnoreCase("Dog")){
            return new Dog();
        } else if(type.equalsIgnoreCase("Cat")){
            return new Cat();
        } else {
            return null;
        }
    }
}

class Dog implements Toy {
    // Write your code here
    public void talk(){
        System.out.println("Wow");
    }
}

class Cat implements Toy {
    // Write your code here
    public void talk(){
        System.out.println("Meow");
    }
}
