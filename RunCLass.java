import java.util.Scanner;

public class RunCLass {
    public static void main(String[] args) throws Exception
    {
        Hello hl = new Hello();
        GoodBye gBye = new GoodBye();
        SayAnyThing sThing = new SayAnyThing();

        hl.sayHello();
        sThing.sayAnyThing();        
        gBye.sayGoodBye();
    }
}
