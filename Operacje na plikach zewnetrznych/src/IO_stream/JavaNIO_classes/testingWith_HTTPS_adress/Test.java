package IO_stream.JavaNIO_classes.testingWith_HTTPS_adress;

import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;

public class Test {

    public static void main(String[] args) throws URISyntaxException, IOException {

//        try {
//            Path webPath = Paths.get((new URI("https://www.wp.pl/")));
//        } catch (URISyntaxException e) {
//            System.err.println(e); // Provider "htttp" not installed
//        }


        // tak mozna pobierac dane ze stron
        URI website = new URI("https://some.adress.pl");
        ReadableByteChannel rbc = Channels.newChannel(website.toURL().openStream());
        FileOutputStream fos = new FileOutputStream("information2.html");
        fos.getChannel().transferFrom(rbc, 0, Long.MAX_VALUE);
    }
}
