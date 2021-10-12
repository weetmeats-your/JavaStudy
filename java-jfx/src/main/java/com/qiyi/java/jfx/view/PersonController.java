package com.qiyi.java.jfx.view;

import com.qiyi.java.jfx.MainApp;
import com.qiyi.java.jfx.model.Person;
import com.qiyi.java.jfx.until.DateUtil;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.collections.transformation.FilteredList;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @program：java-jfx
 * @description:
 * @author: qiyi
 * <p>
 * create: 2021-10-08 23:48
 **/
public class PersonController {


    private MainApp mainApp;

    private FilteredList<Person> filteredData;


    @FXML
    private TableView<Person> personTable;

    @FXML
    private TableColumn<Person, String> nameColumn;


    @FXML
    private TableColumn<Person, String> clazzColumn;


    @FXML
    private Label nameLabel;

    @FXML
    private Label genderLabel;

    @FXML
    private Label addressLabel;

    @FXML
    private Label birthdayLabel;

    @FXML
    private ImageView avatar;

    @FXML
    private TextField inputField;

    public PersonController() {

    }


    @FXML
    private void initialize() {
        nameColumn.setCellValueFactory(cellData -> cellData.getValue().nameProperty());
        clazzColumn.setCellValueFactory(cellData -> cellData.getValue().clazzProperty());
        personTable.getSelectionModel().selectedItemProperty().addListener(
                (observable, oldValue, newValue) -> showPersonDetails(newValue));
    }


    /**
     * 接收主窗体对象，获取数据
     *
     * @param mainApp mainApp
     */
    public void setMainApp(MainApp mainApp) {
        this.mainApp = mainApp;
        filteredData = new FilteredList<>(mainApp.getPersonData(), p -> true);
        inputField.textProperty().addListener((observable, oldValue, newValue) -> filteredData.setPredicate(person -> {
            if (newValue == null || newValue.isEmpty()) {
                return true;
            }
            String lowerCaseFilter = newValue.toLowerCase();
            return person.getName().toLowerCase().contains(lowerCaseFilter)
                    || person.getClazz().toLowerCase().contains(lowerCaseFilter)
                    || person.getAddress().toLowerCase().contains(lowerCaseFilter);
        }));
        personTable.setItems(filteredData);
        showPersonDetails(filteredData.get(0));
    }

    /**
     * 查询用户
     */
    public void handleSearchPerson() {
        String keywords = inputField.getText().trim();
        ObservableList<Person> items = personTable.getItems();
        List<Person> list = items.stream()
                .filter(p -> p.getName().contains(keywords) || p.getClazz().contains(keywords))
                .collect(Collectors.toList());
        if (list.size() != 0) {
            personTable.setItems(FXCollections.observableList(list));
            showPersonDetails(list.get(0));
        }
        inputField.setText("");
    }


    /**
     * 显示用户详情
     *
     * @param person person
     */
    private void showPersonDetails(Person person) {
        if (person != null) {
            nameLabel.setText(person.getName());
            genderLabel.setText(person.getGender());
            addressLabel.setText(person.getAddress());
            birthdayLabel.setText(DateUtil.format(person.getBirthday()));
            avatar.setImage(person.getAvatar());
        } else {
            nameLabel.setText("姓名");
            genderLabel.setText("性别");
            addressLabel.setText("地址");
            birthdayLabel.setText("生日");
            avatar.setImage(new Image("https://niit-soft.oss-cn-hangzhou.aliyuncs.com/avatar/me.jpg"));
        }
    }

    /**
     * 删除用户
     */
    public void handleDeletePerson() {
        int selectedIndex = personTable.getSelectionModel().getSelectedIndex();
        if (selectedIndex >= 0) {
            mainApp.getPersonData().remove(selectedIndex);
        } else {
            Alert a = new Alert(Alert.AlertType.ERROR);
            a.setTitle("提示");
            a.setHeaderText("错误操作");
            a.setContentText("必须选择人员才能删除");
            a.showAndWait();
        }
    }


    public void handleNewPerson() {
        mainApp.showNewPersonStage();
        mainApp.getStage().setIconified(true);
    }

}