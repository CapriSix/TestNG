import org.testng.annotations.Test;

public class TestMe {
    @org.testng.annotations.Test
    public void setup()
    {
        System.out.println("Open Browser");
    }
    @org.testng.annotations.Test
    public void login ()
    {
        System.out.println("LogIn test");
    }

    @org.testng.annotations.Test
    public void teardown()
    {
        System.out.println("Test my test");
    }
}
