/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;


import java.util.ArrayList;

/**
 *
 * 
 */
public class Album {
    
    public int id;
    public string name;
    private ArrayList<Photo> Photos = new ArrayList<Photo>();
    private ArrayList<User> SharedWith=new ArrayList<User>();
    
    public void addPhoto(Photo Photonew)
    {
        Photos.add(Photonew);
    }
    public ArrayList getPhotos()
    {
        return Photos;        
    }
    public void removePhoto(int Photoid)
    {
        int i=0;
        while(i<Photos.size())
        {
            if(Photos[i].id == Photoid)
            {
                Photos.remove(i);
                break;
            }
        }
        
    }
    public void ShareWith(User Usernew)
    {
        SharedWith.add(Usernew);
    }
    
}
