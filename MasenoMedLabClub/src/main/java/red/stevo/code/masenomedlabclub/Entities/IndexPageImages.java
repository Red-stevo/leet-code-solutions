package red.stevo.code.masenomedlabclub.Entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import org.hibernate.validator.constraints.URL;

@Data
@Entity
@Table(schema = "index_page_images")
public class IndexPageImages {

    @Id
    @Column(unique = true, name = "image_id")
    private String id;

    @Column(unique = true, name = "image_url")
    @URL(regexp = "^https:\\/\\/res\\.cloudinary\\.com\\/.*")
    private String url;

    @Column(name = "image_name")
    private String name;

    @Column(name = "image_description")
    private String description;

}
