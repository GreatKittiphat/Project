package ku.cs.posfinalproject.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import ku.cs.posfinalproject.services.FXRouter;

import java.io.IOException;

public class MenuController {


    @FXML
    public void onBillButtonClick (ActionEvent actionEvent) {
        try {
            FXRouter.goTo("Member");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    @FXML
    public void onLogoutClick() {
        try {
            FXRouter.goTo("login");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @FXML
    public void onStockClick() {
        try {
            FXRouter.goTo("Stock");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

