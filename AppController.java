package gphotos;

import java.util.*;

class AppController {
  private long lastSync;
  private LinkedList<String> includedFolders;
  private LinkedList<String> excludedFolders;
  private LinkedList<String> excludedPhotos;
  private boolean isBrowser;

  private Map<Integer, Photo> photos;
  private Map<Integer, Album> albums;

  AppController() {
    this.autoSync();
  }

  private void autoSync() {
    this.lastSync = System.currentTimeMillis();
    System.out.println("Synced");
  }

  public Photo[] fetchPhotos() {
    return null;
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
