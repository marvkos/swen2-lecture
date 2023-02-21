module at.technikum.helloworld {
    requires javafx.controls;
    requires javafx.fxml;


    opens at.technikum.helloworld to javafx.fxml;
    exports at.technikum.helloworld;
}