package lab9.lab6.services;

public class ImageLoaderFactory {
    public static ImageLoader create(String imageName) throws Exception {
        if (imageName.endsWith(".jpg"))
            return new JPGImageLoader(imageName);
        else if (imageName.endsWith(".bmp"))
            return new BMPImageLoader(imageName);
        else
            throw new Exception("Unsupported image type");
    }
}
