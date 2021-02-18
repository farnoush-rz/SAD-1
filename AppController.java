package SAD1;

import java.util.*;

class AppController {
  private long lastSync;
  private LinkedList<String> includedFolders;
  private LinkedList<String> excludedFolders;
  private LinkedList<String> excludedPhotos;
  private boolean isBrowser;

  public Map<Integer, Photo> photos;
  public Map<Integer, Album> albums;
  public User user;

  AppController() {
    this.autoSync();
  }

  private void autoSync() {
    this.lastSync = System.currentTimeMillis();
    System.out.println("Synced");
  }

  public void sync() {
    this.autoSync();
  }

  public Map<Integer, Photo> fetchPhotos() {
    Photo photo1 = new Photo("photo-1.png");
    Photo photo2 = new Photo("photo-2.png");
    Photo photo3 = new Photo("photo-3.png");
    Photo photo4 = new Photo("photo-4.png");
    Photo photo5 = new Photo("photo-5.png");

    this.photos = new HashMap<Integer, Photo>();
    int i = 0;
    this.photos.put(i++, photo1);
    this.photos.put(i++, photo2);
    this.photos.put(i++, photo3);
    this.photos.put(i++, photo4);
    this.photos.put(i++, photo5);
    return this.photos;
  }

  public Album[] fetchAlbums() {
    return null;
  }

  public Album openAlbum(int albumId) {
    return this.albums.get(albumId);
  }

  public void createAlbum(String name) {
    Album newAlbum = new Album(name);
    this.albums.put(newAlbum.id, new Album(name));
  }

  public void createPhoto(String fileName) {
    Photo newPhoto = new Photo(fileName);
    this.photos.put(newPhoto.id, new Photo(fileName));
  }
}
