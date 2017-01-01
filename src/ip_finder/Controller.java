package ip_finder;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class Controller {

    @FXML
    private TextField input;

    //Instance of the Model class
    Model model = new Model();

    //Temporary String to hold the url
    String temp;


    /*
    * On button click
    */

    @FXML
    private void onClick(ActionEvent event) {
        temp = input.getText();
        model.getIP(temp);
    }
}
