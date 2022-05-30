module com.revision {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.revision to javafx.fxml;
    exports com.revision;
}
