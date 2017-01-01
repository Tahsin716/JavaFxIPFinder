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
            showDialog(ip);
        }
        catch (UnknownHostException e) {
            showDialog("Something wrong with web address provided!");
        }
    }



    /*
    * Displays the IP address on a dialog box
    */

    private void showDialog(String result) {

        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("IP Finder");
        alert.setHeaderText(null);
        alert.setContentText(result);

        alert.showAndWait();

    }

}
