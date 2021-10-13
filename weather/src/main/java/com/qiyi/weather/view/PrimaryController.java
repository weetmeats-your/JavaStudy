package com.qiyi.weather.view;

import com.qiyi.weather.util.ApiConnector;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

/**
 * @program：weather
 * @description: 控制器
 * @author: qiyi
 * <p>
 * create: 2021-10-13 22:50
 **/
public class PrimaryController {
    @FXML
    private TextField cityInput;
    @FXML
    private Text weatherText;

    @FXML
    void getWeatherData(ActionEvent event) {
        JSONObject todayWeather = getTodayWeatherInformation(getWoeid());
        System.out.println(todayWeather);
        weatherText.setText(
                "Current Date: " + todayWeather.get("applicable_date") +
                        "\nCurrent city: " + cityInput.getText() +
                        "\nCurrent temperature: " +
                        todayWeather.get("the_temp") +
                        "\nMax temperature: " +
                        todayWeather.get("max_temp") +
                        "\nMin temperature: " +
                        todayWeather.get("min_temp") +
                        "\nWind speed: " + todayWeather.get("wind_speed")
        );
    }

    public String getWoeid() {
        String cityApi = "https://www.metaweather.com/api/location/search/?query=";
        ApiConnector apiConnectorCity = new ApiConnector(cityApi);
        JSONObject jsonData = (JSONObject) (apiConnectorCity.getJsonArray(cityInput.getText())).get(0);
        System.out.println(jsonData);
        return jsonData.get("woeid").toString();
    }

    public JSONObject getTodayWeatherInformation(String woeid) {
        String weatherApi = "https://www.metaweather.com/api/location/";
        ApiConnector apiConnectorWeather = new ApiConnector(weatherApi);
        JSONObject weatherJsonObject = apiConnectorWeather.getJsonObject(woeid + "/");
        JSONArray weatherArray = (JSONArray) weatherJsonObject.get("consolidated_weather");
        return (JSONObject) weatherArray.get(0);
    }
}
