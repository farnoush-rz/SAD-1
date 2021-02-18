/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.JFrame;

/**
 *
 */
public class Contact {
    private int id;
    private string name;
    private string email;
    private string comment;
    private GeoLocation Glocation;
    private boolean LikePhoto;

    public Contact() {
    }

    public Contact(int id, string name, string email) {
        this.id = id;
        this.name = name;
        this.email = email;
        LikePhoto=false;
    }
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public string getName() {
        return name;
    }

    public void setName(string name) {
        this.name = name;
    }

    public string getEmail() {
        return email;
    }

    public void setEmail(string email) {
        this.email = email;
    }
    public void Comment(string comments)
    {
        comment=comments;
    }
    public void Like()
    {
        LikePhoto=true;
    }
    public void LocationMatching(GeoLocation Gloc)
    {
        Glocation=Gloc;
    }
    public void Block()
    {
        
    }
    public void SaveInGallary()
    {
        JFrame parentFrame = new JFrame();
 
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Specify a file to save");   

        int userSelection = fileChooser.showSaveDialog(parentFrame);

        if (userSelection == JFileChooser.APPROVE_OPTION) {
            File fileToSave = fileChooser.getSelectedFile();
            System.out.println("Save as file: " + fileToSave.getAbsolutePath());
        }
     }
        
};
    
   
