module com.example.demo {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires org.apache.derby.client;
    requires org.apache.derby.commons;
    requires org.apache.derby.tools;
    requires org.mybatis;



    opens com.example.demo to javafx.fxml;
    exports at.htl.survey;
    opens at.htl.survey to javafx.fxml;
    exports at.htl.survey.controllerx;
    opens at.htl.survey.controllerx to javafx.fxml;
}