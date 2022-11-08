package com.example.jungyulee_comp228sec402_lab4;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.text.Text;

import java.net.URL;
import java.util.ResourceBundle;

public class AccountFormController implements Initializable {
    @FXML
    private TextField nameTextField, phoneTextField, postalTextField;
    @FXML
    private Text invalidPersonal;
    @FXML
    private ChoiceBox<String> incomeChoiceBox;
    private String[] annualIncome = {"< 60000 CAD", "60000 - 100,000 CAD", "100,000 - 175,000 CAD", "> 175,000 CAD"};
    @FXML
    private RadioButton rButton1, rButton2, rButton3, rButton4, rButton5;
    @FXML
    private Text invalidIncome;
    @FXML
    private ListView<String> accountListView;
    private String[] accountService = {"Checking Account", "Savings Account", "GIC Account", "Investment Account", "Line of Credit"};
    @FXML
    private Text invalidAccount;
    @FXML
    private CheckBox cBox1, cBox2;
    @FXML
    private Text invalidCheck;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        incomeChoiceBox.getItems().addAll(annualIncome);
        accountListView.getItems().addAll(accountService);
        accountListView.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
    }

    public void validateCheck(){
        if(!cBox1.isSelected() || !cBox2.isSelected()){
            invalidCheck.setOpacity(1);
        } else {
            invalidCheck.setOpacity(0);
        }
    }


    public void validateAccount(){
//        if(accountListView.getSelectionModel().getSelectedItems().size()==0){
//            invalidAccount.setOpacity(1);
//        } else {
//            invalidAccount.setOpacity(0);
//        }
    }
    public void validateIncome(){
//        if(incomeChoiceBox.getSelectionModel().isEmpty()){
//            invalidIncome.setOpacity(1);
//        } else {
//            invalidIncome.setOpacity(0);
//        }
//        if(!(rButton1.isSelected() || rButton2.isSelected() || rButton3.isSelected() || rButton4.isSelected() || rButton5.isSelected())){
//            invalidIncome.setOpacity(1);
//        } else {
//            invalidIncome.setOpacity(0);
//        }
    }



    // personal details validation
    public void validatePersonal() {
//        String name = nameTextField.getText();
//        String phone = phoneTextField.getText();
//        String postal = postalTextField.getText();
//
//        if(name == null || name.trim().isEmpty()){
//            invalidPersonal.setOpacity(1);
//        } else {
//            invalidPersonal.setOpacity(0);
//        }
//        if(phone.length() != 10){
//            invalidPersonal.setOpacity(1);
//        } else {
//            invalidPersonal.setOpacity(0);
//        }
//        if(postal.matches("\"[A-Za-z0-9]\"") || postal.length() != 6){
//            invalidPersonal.setOpacity(1);
//        } else {
//            invalidPersonal.setOpacity(0);
//        }
    }


}