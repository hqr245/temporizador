module com.example.temporizador {
    requires javafx.controls;
    requires javafx.fxml;
    requires es.ieslosmontecillos.componentes_caroantonio;


    opens com.example.temporizador to javafx.fxml;
    exports com.example.temporizador;
}