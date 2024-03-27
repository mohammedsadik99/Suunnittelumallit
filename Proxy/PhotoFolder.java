import java.util.ArrayList;
import java.util.List;

class PhotoFolder {
    private List<Image> photos;

    public PhotoFolder() {
        photos = new ArrayList<>();
    }

    public void addPhoto(Image photo) {
        photos.add(photo);
    }

    public void showContents() {
        System.out.println("Photos in the folder:");
        for (Image photo : photos) {
            photo.showData();
        }
    }

    public void displayPhoto(int index) {
        if (index >= 0 && index < photos.size()) {
            photos.get(index).displayImage();
        } else {
            System.out.println("Invalid index");
        }
    }
}
