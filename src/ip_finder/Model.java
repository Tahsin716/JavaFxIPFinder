package ip_finder;

import javafx.scene.control.Alert;

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

        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("IP Finder");
        alert.setContentText(result);

        alert.showAndWait();

    }

}
