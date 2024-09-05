package red.stevo.code.masenomedlabclub.Entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.URL;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(schema = "index_page_images")
public class IndexPageImages {

    @Id
    @Column(unique = true, name = "image_id", nullable = false)
    @Size(min = 4, message = "Image id is too short.")
    private String id;

    @Column(unique = true, name = "image_url", nullable = false)
    @URL(regexp = "^https:\\/\\/res\\.cloudinary\\.com\\/.*")
    private String url;

    @Column(name = "image_name", nullable = false)
    @Size(min = 4, message = "Image Name is too short.")
    private String name;

    @Column(name = "image_description", nullable = false)
    @Size(min = 4, message = "Image Description is too Short.")
    private String description;

}
