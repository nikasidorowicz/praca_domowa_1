package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {
    public Label label;
    public TextField textfield1;
    public TextField textfield2;

    public void handleClick(ActionEvent actionEvent) {
        label.setText(razem(textfield1.getText(), textfield2.getText()));
//        label.setText("KATS");
    }

    private String razem (String tekst1, String tekst2){
        if (tekst1 != null && tekst2 != null){
            return tekst1+tekst2;
        }
        else if (tekst1 != null) {
            return tekst1;
        } else if (tekst2 != null) {
            return tekst2;
        } else {
            return "---";
        }
    }
}


