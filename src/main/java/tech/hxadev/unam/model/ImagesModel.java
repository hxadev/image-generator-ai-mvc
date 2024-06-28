package tech.hxadev.unam.model;

import java.util.ArrayList;
import java.util.List;

import tech.hxadev.unam.entities.ImageDAO;
/**
 * @author <a href="https://github.com/hxadev">HXADEV</a>
 * @since 1.0
 */
public class ImagesModel {
    List<ImageDAO> images;

    public ImagesModel(){
        images = new ArrayList<ImageDAO>();
    }

    public List<ImageDAO> getImages() {
        return images;
    }

    public void setImages(List<ImageDAO> images) {
        this.images = images;
    }

    public void addImage(ImageDAO image) {
        images.add(image);
    }

    public ImageDAO getFirstImage() {
        return images.get(0);
    }

    public ImageDAO getLastImage() {
        return images.get(images.size() - 1);
    }

    public ImageDAO getImageByPrompt(String prompt) {
        for (ImageDAO image : images) {
            if(image==null)
                return null;
            if (image.getName().equalsIgnoreCase(prompt)) {
                return image;
            }
        }
        return null;
    }
}
