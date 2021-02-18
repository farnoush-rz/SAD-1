/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication15;

import java.util.Date;

/**
 *
 * @author bita
 */
public class Photo {

    public int id;
    public boolean isVideo;
    public String fileName;
    private String fileStoragaName;
    public GeoLocation geoLocation;
    public long time;
    private boolean favorite;
    private Person[] people;
    public int nPeople;
    public User[] shareedWithUsers;
    public int nShareedWithUsers;
    public boolean trash;
    public Filter filter;

    //************************************************
    public void Photo(String fileStorageName) {

        this.id++;
        this.isVideo = false;
        this.fileName = "photo" + id;
        this.fileStoragaName = fileStorageName;
        //
        Date date = new Date();
        this.time = date.getTime();
        people = new Person[1000];
        shareedWithUsers = new User[1000];

    }

    //seter********************************************
    public void setFileStorageName(String fileStorageName) {

        this.fileStoragaName = fileStorageName;

    }

    public void setFavorite(boolean favorite) {

        this.favorite = favorite;

    }

    public void setPeople(Person people) {

        this.people[nPeople] = people;
        nPeople++;

    }

    public void setSharedWithUsers(User shareedWithUsers) {

        this.shareedWithUsers[nShareedWithUsers] = shareedWithUsers;
        nShareedWithUsers++;

    }

    //getters**************************************************
    public String getFileStorageName() {

        return this.fileStoragaName;

    }

    public boolean getFavorite() {

        return this.favorite;

    }

    public Person[] getPeople() {

        return this.people;

    }

    public User[] getShareedWithUsers() {

        return this.shareedWithUsers;

    }

    //methods***************************************************
    public void delete() {

        Date date = new Date();
        long t = date.getTime();
        trash = true;

        //add photo to trash
        while (t - time < 1296000000) {//15 day

            t = date.getTime(); //Time at any moment

        }

        //delete photo from trash
    }

    private void copy(Photo p) {

        Photo photo = new Photo();
        photo.isVideo = p.isVideo;
        photo.fileName = "photo" + id;
        photo.fileStoragaName = p.fileStoragaName;
        photo.geoLocation = p.geoLocation;
        Date date = new Date();
        photo.time = date.getTime();

    }

    public void applyFilters(int filter) {

        //Filter=null
        switch (filter) {
            case 1://Filter=Filter+Suggestion
                
                //Suggestion:
                
                // Enhance
                //Warm
                //Cool
                break;

            case 2://Filter=Filter+Crop
                
                    
                break;

            case 3://Filter=Filter+Adjust
                
                //Adjust:
                //Brightness
                //Contrast
                //White piont
                //Highlights
                //Shadows
                //Black points
                //Saturation
                //Warmth
                //Tint
                //Skin tone
                //Blue tone
                //Pop
                //Vignette
                break;

            case 4://Filter=Filter+Filter
                
                //Filters:
                //None
                //Vivid
                //West
                //Palma
                //Metro
                //Eiffel
                //Blush
                //Modena
                //Reel
                //Vogue
                //Ollie
                //Bazaar
                //Alpaca
                //Vista

                break;

            case 5://More:
                //Markup
                //Apps
                break;

        }

    }

    public void rename(Photo p, String name) {

        p.setFileStorageName(name);

    }

    public void createCollage(Photo[] p, int n) {
        
        Collage collage = new Collage();
        
        
    }

    public void createAnimation(Photo[] p, int n) {

    }

    public void removeCollage() {

    }

    public void removeAnimation() {

    }

    public void moveToAlbum() {

    }

}
