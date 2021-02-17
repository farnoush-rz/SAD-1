package javaapplication13;

public class Photo {

    public int id;
    public boolean isVoid;
    private String fileStoragaName;
    public GeoLocation geoLocation;
    public Time time;
    private boolean favorite;
    private Person[] people;
    public User[] sharedWithUsers;

    //************************************************
    public void Photo() {

    }

    //seter********************************************
    public void setFileStorageName(String fileStorageName) {

        this.fileStoragaName = fileStorageName;

    }

    public void setFavorite(boolean favorite) {

        this.favorite = favorite;

    }

    public void setPeople(Person[] people) {

        this.people = people;

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

    //methods***************************************************
    public void delete() {

    }

    private void copy() {

    }

    public void applyFilters(String filters) {

    }

    public void rename(String name1, String name2) {

    }

    public void createCollage(Photo photos, Layout layout) {

    }

    public void createAnimation(Photo photos) {

    }

    public void removeCollage() {

    }

    public void removeAnimation() {

    }

    public void moveToAlbum() {

    }

}
