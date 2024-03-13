module ku.cs.posfinalproject {
    requires javafx.controls;
    requires javafx.fxml;
    requires org.jetbrains.annotations;

    opens ku.cs.posfinalproject to javafx.fxml;
    exports ku.cs.posfinalproject;

    exports ku.cs.posfinalproject.controllers;
    opens ku.cs.posfinalproject.controllers to javafx.fxml;
}