module com.example.studentmanager {
    requires javafx.controls;
    requires javafx.fxml;


    opens loose.oose.fis.lab.student.manager.controllers to javafx.fxml;
    opens loose.oose.fis.lab.student.manager.model to javafx.base;
    exports loose.oose.fis.lab.student.manager;
    exports loose.oose.fis.lab.student.manager.controllers to javafx.fxml;
}
