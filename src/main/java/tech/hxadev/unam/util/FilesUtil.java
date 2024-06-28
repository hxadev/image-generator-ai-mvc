package tech.hxadev.unam.util;

import java.io.File;
import java.util.UUID;
/**
 * @author <a href="https://github.com/hxadev">HXADEV</a>
 * @since 1.0
 */
public class FilesUtil {
    public static String parsePromptToImageName(String prompt) {
        return prompt.replace(" ", "_").trim().toLowerCase() + "_" + UUID.randomUUID() + "_" + ".jpg";
    }

    public static String parsePromptToFolderName(String prompt) {
        return "result" + File.separator + prompt.replace(" ", "_").trim().toLowerCase();
    }
}
