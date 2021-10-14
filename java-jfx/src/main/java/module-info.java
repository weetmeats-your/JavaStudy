module com.qiyi.java.jfx {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;
    requires AnimateFX;
    requires javafx.web;
    requires json.simple;


    opens com.qiyi.java.jfx.ctrl to javafx.fxml;
    exports com.qiyi.java.jfx;
    opens com.qiyi.java.jfx to javafx.fxml;

    opens com.qiyi.java.jfx.layout to javafx.fxml;
    exports com.qiyi.java.jfx.layout;

    opens com.qiyi.java.jfx.basic to javafx.fxml;
    exports com.qiyi.java.jfx.basic;

    opens com.qiyi.java.jfx.effect to javafx.fxml;
    exports com.qiyi.java.jfx.effect;

    opens com.qiyi.java.jfx.view to javafx.fxml;
    exports com.qiyi.java.jfx.view;


    opens com.qiyi.weather to javafx.fxml;
    exports com.qiyi.weather;

    opens com.qiyi.weather.view to javafx.fxml;
    exports com.qiyi.weather.view;
    exports com.qiyi.weather.util;
}