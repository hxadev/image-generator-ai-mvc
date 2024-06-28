package tech.hxadev.unam.view;

import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

import tech.hxadev.unam.controller.ImageGeneratorController;
import tech.hxadev.unam.entities.GenerationInfo;
import tech.hxadev.unam.entities.ImageDAO;

/**
 * @author <a href="https://github.com/hxadev">HXADEV</a>
 * @since 1.0
 */
public class ImageGeneratorView {
    private ImageGeneratorController controller;

    public ImageGeneratorView(ImageGeneratorController controller) {
        this.controller = controller;
    }

    public void run() {
        try {
            int centinel = 0;
            int option = 1;

            do {
                this.banner();
                option = new Scanner(System.in).nextInt();

                switch (option) {
                    case 1:
                        this.runGenerateImage();
                        break;
                    case 2:
                        this.displayImages();
                        break;
                    case 3:
                        this.displayImageByPrompt();
                        break;
                    case 0:
                        System.out.println("Hasta Luego");
                        break;

                    default:
                        break;
                }
            } while (option != centinel);

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    private void banner() {
        out.println("\n+++ Generador de imagenes utilizando AI +++");
        out.println("\n+++ Selecciona la opcion que deseas utilizar +++");
        out.println("\n+++ 1) Generar imagen - 2) Mostrar historial - 3) Obtener Imagen por prompt - 0) Salir +++");
    }

    private void bannerPrompt() {
        out.println(">> Ingresa el prompt de la imagen que quieres generar");
        out.println(">> Que imagen quieres generar? ");
        out.print(">> ");
    }

    private void bannerPromptExist() {
        out.println(">> Ingresa el prompt de la imagen que quieres obtener ");
        out.print(">> ");
    }

    private String inputPrompt() {
        bannerPrompt();
        return new Scanner(System.in).nextLine();
    }

    private void displayImages() {
        this.controller.getImages().stream()
                .forEach(image -> {
                    System.out.println(
                            "Image Name:" + image.getName() +
                                    " Image URL:" + image.getUrl() +
                                    " Image Creation Date:" + image.getCreated());
                });
    }

    private void runGenerateImage() {
        this.controller
                .generateImage(GenerationInfo.builder().prompt(this.inputPrompt()).build());
    }

    private void displayImageByPrompt() {
        bannerPromptExist();
        String prompt = new Scanner(System.in).nextLine();
        ImageDAO image = this.controller
                .getImageByPromp(prompt);

        if (image == null) {
            throw new RuntimeException("¡¡¡¡¡ No se encontro la imagen con el prompt !!!!!!! :  " + prompt);
        }
        System.out.println(
                "Image Name:" + image.getName() +
                        " Image URL:" + image.getUrl() +
                        " Image Creation Date:" + image.getCreated());
    }

}
