package tech.hxadev.unam.entities;

import lombok.Builder;
import lombok.Data;
import lombok.ToString;
/**
 * @author <a href="https://github.com/hxadev">HXADEV</a>
 * @since 1.0
 */
@Data
@Builder
@ToString
public class Request {
    private String model;
    private String prompt;
    private Short n;
    private String size;
    private String aspect_ratio;
}
