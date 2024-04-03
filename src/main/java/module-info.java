module com.example.javafx_sample {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires net.synedra.validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;

    opens com.example.javafx_sample to javafx.fxml;
    exports com.example.javafx_sample;
	exports com.example.javafx_sample.helloview;
	opens com.example.javafx_sample.helloview to javafx.fxml;
}