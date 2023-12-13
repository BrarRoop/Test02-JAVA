module com.georgiancollege.test2 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.net.http;
    requires com.google.gson;


    opens com.georgiancollege.test2 to javafx.fxml;
    exports com.georgiancollege.test2;
}