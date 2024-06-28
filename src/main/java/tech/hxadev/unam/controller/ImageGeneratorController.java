package tech.hxadev.unam.controller;

import java.util.List;

import tech.hxadev.unam.entities.GenerationInfo;
import tech.hxadev.unam.entities.ImageDAO;
/**
 * @author <a href="https://github.com/hxadev">HXADEV</a>
 * @since 1.0
 */
public interface ImageGeneratorController {

    public void generateImage(GenerationInfo info);

    public void addImage(ImageDAO image);

    public ImageDAO getFirstImage();

    public List<ImageDAO> getImages();

    public ImageDAO getImageByPromp(String prompt);
}
