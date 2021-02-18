package SAD1;

import java.util.*;

class Person {
  public static int lastId = 0;
  public int id;
  private boolean isSelf;
  private String name;

  private LinkedList<Integer> photos;

  Person(boolean isSelf, String name) {
    this.id = ++Person.lastId;
    this.isSelf = isSelf;
    this.name = name;
  }

  public void setName(String name) {
    this.name = name;
  }

  // Get the name of the person, used to show who is in a picture or a video
  public String getName() {
    return this.name;
  }

  // Used when a new photo is added to the app and people are recognized in it
  public void addPhoto(int photoId) {
    this.photos.add(photoId);
  }

  // Used when user wants to disassociate a photo from a person
  public void removePhoto(int photoId) {
    this.photos.remove(photoId);
  }
}
