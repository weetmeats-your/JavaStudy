module java.jfx {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.qiyi.javajfx.ctrl to javafx.fxml;
    exports com.qiyi.javajfx;
}