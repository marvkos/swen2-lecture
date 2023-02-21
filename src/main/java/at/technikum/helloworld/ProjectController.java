package at.technikum.helloworld;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;

public class ProjectController {

    @FXML
    private ListView<String> tourList;

    @FXML
    private void addDummyTour() {
        String tourName = "Dummy Tour " + (int)(Math.random()*(100-1+1)+1);

        tourList.getItems().add(tourName);
    }

    @FXML
    private void deleteSelectedTour() {
        int selectedIndex = tourList.getSelectionModel().getSelectedIndex();
        tourList.getItems().remove(selectedIndex);
    }
}
