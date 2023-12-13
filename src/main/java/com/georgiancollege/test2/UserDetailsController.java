package com.georgiancollege.test2;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.net.URL;
import java.util.ResourceBundle;

public class UserDetailsController implements Initializable {

    @FXML
    private TableView<User> tableView;

    @FXML
    private TableColumn<User, Integer> idColumn;

    @FXML
    private TableColumn<User, String> firstNameColumn;

    @FXML
    private TableColumn<User, String> lastNameColumn;

    @FXML
    private TableColumn<User, String> ageColumn;

    @FXML
    private TableColumn<User, String> emailColumn;

    @FXML
    private TableColumn<User, String> phoneColumn;

    @FXML
    private TableColumn<User, String> birthDateColumn;

    @FXML
    private TableColumn<User, String> universityColumn;

    @FXML
    private Label noOfUsersLabel;

    @FXML
    private ListView<String> addressListView;

    @FXML
    private ImageView imageView;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        ApiResponse apiResponse = Utility.getUsersFromAPI();
        // initializing all the columns with the getters
        //id, first name, lastname, age, email, phone, birthdate, and university.
        idColumn.setCellValueFactory(new PropertyValueFactory<>("id"));
        firstNameColumn.setCellValueFactory(new PropertyValueFactory<>("firstName"));
        lastNameColumn.setCellValueFactory(new PropertyValueFactory<>("lastName"));
        ageColumn.setCellValueFactory(new PropertyValueFactory<>("age"));
        emailColumn.setCellValueFactory(new PropertyValueFactory<>("email"));
        phoneColumn.setCellValueFactory(new PropertyValueFactory<>("phone"));
        birthDateColumn.setCellValueFactory(new PropertyValueFactory<>("birthDate"));
        universityColumn.setCellValueFactory(new PropertyValueFactory<>("university"));

        tableView.getItems().addAll(apiResponse.getUsers());
        noOfUsersLabel.setText("No. of Users: " + tableView.getItems().size());

        // add a listener to the tableview
        tableView.getSelectionModel().selectedItemProperty().addListener(
                (observableValue, oldUser, newUser) -> {
                    imageView.setImage(new Image(newUser.getImage()));


                    addressListView.getItems().add(newUser.getAddresses().getAddress());
                    addressListView.getItems().add(newUser.getAddresses().getState());
                    addressListView.getItems().add(newUser.getAddresses().getCity());
                    addressListView.getItems().add(newUser.getAddresses().getPostalCode());




                });
    }


    @FXML
    void allUsersButton_onClick(ActionEvent event) {
        ApiResponse apiResponse = Utility.getUsersFromAPI();

        // Update the TableView
        ObservableList<User> allUsers = FXCollections.observableArrayList(apiResponse.getUsers());
        tableView.setItems(allUsers);


        noOfUsersLabel.setText("No. of Users: " + allUsers.size());

        // Clear the addressListView when loading all users
        addressListView.getItems().clear();

        // Reset the image
        imageView.setImage(null);
    }

    @FXML
    void usersLessThan30Button_onClick(ActionEvent event) {
        ObservableList<User> allUsers = tableView.getItems();

        // Filter users less than 30
        ObservableList<User> usersLessThan30 = FXCollections.observableArrayList(
                allUsers.filtered(user -> user.getAge() < 30)
        );

        // Update the TableView with users less than 30
        tableView.setItems(usersLessThan30);

        // Update the label with the count of users less than 30
        noOfUsersLabel.setText("No. of Users: " + usersLessThan30.size());

        // Clear the addressListView when filtering users
        addressListView.getItems().clear();

        // Reset the image
        imageView.setImage(null);
    }




}