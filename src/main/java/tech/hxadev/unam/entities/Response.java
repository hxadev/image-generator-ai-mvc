package tech.hxadev.unam.entities;

import lombok.Builder;
import lombok.Data;
import java.util.List;

/**
 * @author <a href="https://github.com/hxadev">HXADEV</a>
 * @since 1.0
 */
@Data
@Builder
public class Response {
    private long created;
    private List<DataRequest> data;
}
