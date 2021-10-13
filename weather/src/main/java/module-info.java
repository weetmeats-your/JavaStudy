module com.qiyi.weather {
    requires javafx.controls;
    requires javafx.fxml;
    requires json.simple;

    opens com.qiyi.weather to javafx.fxml;
    exports com.qiyi.weather;

    opens com.qiyi.weather.view to javafx.fxml;
    exports com.qiyi.weather.view;
    exports com.qiyi.weather.util;
}