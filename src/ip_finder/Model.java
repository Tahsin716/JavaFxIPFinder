package ip_finder;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Model {

    /*
    * Finds the ip address
    */

    public void getIP(String url) {

        try {
            InetAddress inetAddress = InetAddress.getByName(url);
            String ip = inetAddress.getHostAddress();
        }
        catch (UnknownHostException e) {

        }
    }



    /*
    * Displays the IP address on a dialog box
    */

    public void showDialog(String result) {



    }

}
