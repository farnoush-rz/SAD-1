import java.util.*;

public class Person {
  public int id;
  private boolean isSelf;
  private String[] name;
  LinkedList <Integer> photos;

  public Person(int idInput, boolean isSelfInput, String[] nameInput) {
    id = idInput;
    isSelf = isSelfInput;
    name = nameInput;
    photos = new LinkedList<Integer>();
  }

  public void setName(String[] name) {
    this.name = name;
  }

  public String[] getName() {
    return this.name;
  }

  public void addPhoto(int photoId) {
    this.photos.add(photoId);
  }

  public void removePhoto(int photoId){
    this.photos.remove(photoId);
  }
}