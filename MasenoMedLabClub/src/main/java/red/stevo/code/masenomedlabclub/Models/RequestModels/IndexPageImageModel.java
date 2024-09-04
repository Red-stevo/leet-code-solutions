package red.stevo.code.masenomedlabclub.Models.RequestModels;

import lombok.Data;
import org.hibernate.validator.constraints.URL;
import org.springframework.stereotype.Component;

@Data
@Component
public class IndexPageImageModel {

    private String imageId;

    @URL(regexp = "^https:\\/\\/res\\.cloudinary\\.com\\/.*")
    private String imageUrl;

    private String imageDescription;

    private String imageTitle;
}
