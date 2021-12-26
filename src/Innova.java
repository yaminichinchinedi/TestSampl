import org.w3c.dom.Document;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

public class Innova {

public static void main(String args[]) {

    try {

        File f = new File(System.getProperty("user.dir"));
        DocumentBuilderFactory dbf= DocumentBuilderFactory.newInstance();
        DocumentBuilder db = dbf.newDocumentBuilder();
        Document doc =
        db.parse(f);

    }
    catch(Exception e) {

    }


}
}
