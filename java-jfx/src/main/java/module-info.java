module com.qiyi.java.jfx {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;
    requires AnimateFX;
    requires javafx.web;


    opens com.qiyi.java.jfx.ctrl to javafx.fxml;
    exports com.qiyi.java.jfx;
    opens com.qiyi.java.jfx to javafx.fxml;

    opens com.qiyi.java.jfx.layout to javafx.fxml;
    exports com.qiyi.java.jfx.layout;
}