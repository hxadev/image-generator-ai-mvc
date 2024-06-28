package tech.hxadev.unam.client;

import feign.Headers;
import feign.RequestLine;
import tech.hxadev.unam.entities.Request;
import tech.hxadev.unam.entities.Response;
/**
 * @author <a href="https://github.com/hxadev">HXADEV</a>
 * @since 1.0
 */
@Headers({"Content-Type: application/json"})
public interface AIGeneratorClient {

    @RequestLine("POST /api/image/generation")
    public Response generateImagesDalleByPrompt(Request request);

}
