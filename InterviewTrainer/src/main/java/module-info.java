module com.example.interviewtrainer {
    requires javafx.controls;
    requires javafx.fxml;


    opens hi.verkefni.vidmot to javafx.fxml;
    exports hi.verkefni.vidmot;
    exports hi.verkefni.vinnsla;
    opens hi.verkefni.vinnsla to javafx.fxml;
}
