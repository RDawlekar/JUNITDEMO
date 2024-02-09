import org.junit.Test;

public class getMessage {

    @Test
    public  void printmessage() {
    SampleMessage sm=new SampleMessage();
    System.out.println(sm.greeting("Hello Junit"));

    }
}
