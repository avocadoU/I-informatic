module org.example.projectinform {
    requires javafx.controls;
    requires javafx.fxml;
    requires de.jensd.fx.glyphs.fontawesome;
    requires java.sql;
    requires org.xerial.sqlitejdbc;


    opens org.example.projectinform to javafx.fxml;
    exports org.example.projectinform;
    exports org.example.projectinform.Controllers;
    exports org.example.projectinform.Controllers.Student;
}