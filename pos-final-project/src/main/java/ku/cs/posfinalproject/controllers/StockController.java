package ku.cs.posfinalproject.controllers;

import javafx.fxml.FXML;
import ku.cs.posfinalproject.services.FXRouter;

import java.io.IOException;

public class StockController {

    @FXML
    public void backStockClick() {
        try {
            FXRouter.goTo("Menu");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


}
