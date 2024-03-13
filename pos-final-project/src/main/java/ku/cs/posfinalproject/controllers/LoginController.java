package ku.cs.posfinalproject.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Menu;
import javafx.scene.control.TextField;
import ku.cs.posfinalproject.models.AccountList;
import ku.cs.posfinalproject.services.AccountFileDataSource;
import ku.cs.posfinalproject.services.Datasource;
import ku.cs.posfinalproject.services.FXRouter;

import java.io.IOException;

public class LoginController {
    @FXML
    private TextField usernameField;
   @FXML
    private TextField passwordField;
   @FXML
    private Button loginButton;

    Datasource<AccountList> AccountFileDatasource = new AccountFileDataSource();
    AccountList accountList = AccountFileDatasource.readData();

    @FXML
    public void loginButton(ActionEvent actionEvent) {
        if (accountList.login(usernameField.getText(), passwordField.getText())) {
            //System.out.println("Success");
            try {
                FXRouter.goTo("Menu");
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        else {
            System.out.println("incorrect");
        }
        }
}


