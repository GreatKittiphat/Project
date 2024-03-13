package ku.cs.posfinalproject.controllers;

import javafx.fxml.FXML;
import ku.cs.posfinalproject.services.FXRouter;

import java.io.IOException;

public class BillController {
    @FXML
    public void onBackButtonClick() {
        try {
            FXRouter.goTo("Member");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @FXML
    public void menuBillClick() {
        try {
            FXRouter.goTo("Menu");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
