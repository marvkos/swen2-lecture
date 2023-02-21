package at.technikum.helloworld;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {

    @FXML
    private TextField a;
    @FXML
    private TextField b;


    @FXML
    private Button button;

    @FXML
    private Label sum;

    @FXML
    protected void sum() {
        int a = Integer.parseInt(this.a.getText());
        int b = Integer.parseInt(this.b.getText());

        sum.setText("" + (a + b));

        this.a.setText("");
        this.b.setText("");
    }
}