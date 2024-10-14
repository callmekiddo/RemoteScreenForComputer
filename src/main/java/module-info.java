module com.kiddo.remotescreen {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.kiddo.remotescreen to javafx.fxml;
    exports com.kiddo.remotescreen;
}