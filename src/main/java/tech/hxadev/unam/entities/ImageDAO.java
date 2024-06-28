package tech.hxadev.unam.entities;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
public class ImageDAO {
    private String name;
    private String url;
    private Date created;

    
}
