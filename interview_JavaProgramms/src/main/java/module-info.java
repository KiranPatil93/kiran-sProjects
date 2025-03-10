module com.example.interview_javaprogramms {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.interview_javaprogramms to javafx.fxml;
    exports com.example.interview_javaprogramms;
}