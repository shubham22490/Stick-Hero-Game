module com.game.ap_project {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;

    opens com.game.ap_project to javafx.fxml;
    exports com.game.ap_project;
}