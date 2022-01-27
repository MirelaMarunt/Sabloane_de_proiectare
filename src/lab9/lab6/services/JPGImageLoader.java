package lab9.lab6.services;

public class JPGImageLoader implements ImageLoader {
    private String imageName;
    public JPGImageLoader(String imageName) {
        this.imageName = imageName;
    }

    @Override
    public void load(String str) {
        System.out.println("Loaded JPG models.Image: " + str);
    }
}
