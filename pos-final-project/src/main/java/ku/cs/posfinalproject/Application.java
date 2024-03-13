package ku.cs.posfinalproject;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import ku.cs.posfinalproject.services.FXRouter;

import java.io.IOException;

public class Application extends javafx.application.Application {
    @Override
    public void start(Stage stage) throws IOException {
        final double WIDTH = 1366;
        final double HEIGHT = 768;

        FXRouter.bind(this, stage, "POS", WIDTH, HEIGHT);
        configRoute();
        FXRouter.goTo("login");
    }

    private static void configRoute() {
        final String VIEW_PATH = "ku/cs/posfinalproject/views/";

        FXRouter.when("hello", VIEW_PATH + "hello-view.fxml");
        FXRouter.when("login", VIEW_PATH + "login-view.fxml");
        FXRouter.when("Menu", VIEW_PATH + "menu-view.fxml");
        FXRouter.when("Bill", VIEW_PATH + "bill-view.fxml");
        FXRouter.when("Stock", VIEW_PATH + "stock-view.fxml");
        FXRouter.when("Member", VIEW_PATH + "membership-view.fxml");
    }

    public static void main(String[] args) {
        launch();
    }
}