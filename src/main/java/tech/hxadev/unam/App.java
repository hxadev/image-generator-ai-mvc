package tech.hxadev.unam;

import tech.hxadev.unam.controller.ImageGeneratorControllerImpl;
import tech.hxadev.unam.view.ImageGeneratorView;
/**
 * App Image Generator by promt using LLM API AI Platforms
 * @author <a href="https://github.com/hxadev">HXADEV</a>
 * @since 1.0
 */
public class App {
    public static void main(String[] args) {
        ImageGeneratorView view = new ImageGeneratorView(new ImageGeneratorControllerImpl());
        view.run();
    }
}