import java.net.MalformedURLException;

public class Main
{
    public static void main(String[] args) {

        int port = 3000;
        int threads = 10;
        int timer = 0;

        for (int i = 0; i < threads; i++) {

            try {
                Connector connector = new Connector("139.177.182.132", port, timer);
                new Thread(connector).start();
            } catch (MalformedURLException mue) {
                die(mue.getMessage()); // fatal error
            }
        }
    }

    private static void die(String deathMsg)
    {
        System.err.println(deathMsg);
        System.exit(-1);
    }
}