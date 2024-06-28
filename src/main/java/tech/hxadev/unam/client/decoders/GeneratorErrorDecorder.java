package tech.hxadev.unam.client.decoders;

import java.io.IOException;
import java.io.InputStream;
import java.util.Map;

import com.fasterxml.jackson.databind.ObjectMapper;

import feign.Response;
import feign.codec.Decoder;
import feign.codec.ErrorDecoder;
/**
 * @author <a href="https://github.com/hxadev">HXADEV</a>
 * @since 1.0
 */
public class GeneratorErrorDecorder implements feign.codec.ErrorDecoder {

    final Decoder decoder;
    final ErrorDecoder defaultDecoder = new ErrorDecoder.Default();

    public GeneratorErrorDecorder(Decoder decoder) {
        this.decoder = decoder;
    }

    @Override
    public Exception decode(String methodKey, Response response) {
        Map<String,Object> message = null;
        try (InputStream bodyIs = response.body()
            .asInputStream()) {
            ObjectMapper mapper = new ObjectMapper();
            message = mapper.readValue(bodyIs, Map.class);
        } catch (IOException e) {
            return new Exception(e.getMessage());
        }
        return null;
    }

}
