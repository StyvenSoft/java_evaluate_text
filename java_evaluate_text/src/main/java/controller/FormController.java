/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import entities.MainForm;
import java.io.Serializable;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

/**
 *
 * @author s7eveen
 */
@Named(value = "formController")
@ViewScoped
 
public class FormController implements Serializable {
    
    MainForm form = new MainForm();
    
    public MainForm getMainForm() {
        return form;
    }

    public MainForm getForm() {
        return form;
    }

    public void setForm(MainForm form) {
        this.form = form;
    }
    
    
}
