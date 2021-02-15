
/*
public class Person {

  public int id
  private boolean isSelf
  private String[] name
  private int[] photos
  
  LinkedList <Integer> photos = new LinkedList <Integer>();

  public Person(int id, boolean isSelf, String[] name) {

  this.id = id ;
  

  }

  public void setName(String[] name) {
    this.name = name ;
  }

  public String[] getName() {
   
    return this.name ;
  }



  public static void addPhoto(int photoId) {
    this.photos.add(photoId);
  }


public static void removePhoto(int photoId){
  this.photos.remove(photoId);


}


}

*/




public class Person {

  public int id
  private boolean isSelf
  private String[] name
  LinkedList <Integer> photos

  public Person(int idInput, boolean isSelfInput, String[] nameInput) {
    id = idInput;
    isSelf = isSelfInput;
    name = nameInput;
    photos = new LinkedList<Integer>();
  }

  public void setName(String[] name) {
    this.name = name ;
  }

  public String[] getName() {
    return this.name ;
  }

  public static void addPhoto(int photoId) {
    this.photos.add(photoId);
  }

  public static void removePhoto(int photoId){
    this.photos.remove(photoId);
  }
}