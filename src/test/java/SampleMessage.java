import junit.sample.JUnitDemo;

public class SampleMessage implements JUnitDemo {


    @Override
    public String greeting(String name) {
        return name;
    }

}
