package ku.cs.posfinalproject.controllers;

import javafx.fxml.FXML;
import ku.cs.posfinalproject.services.FXRouter;

import java.io.IOException;

public class MembershipController {

    @FXML
    public void backMembershipClick() {
        try {
            FXRouter.goTo("Menu");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @FXML
    public void continueClick() {
        try {
            FXRouter.goTo("Bill");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
