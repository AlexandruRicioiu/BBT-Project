module com.example.bbt {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.bbt to javafx.fxml;
    exports com.example.bbt;
}