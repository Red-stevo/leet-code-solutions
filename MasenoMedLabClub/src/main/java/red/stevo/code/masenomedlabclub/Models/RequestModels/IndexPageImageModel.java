package red.stevo.code.masenomedlabclub.Models.RequestModels;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import lombok.NonNull;
import org.hibernate.validator.constraints.URL;
import org.springframework.stereotype.Component;

@Data
@Component
public class IndexPageImageModel {

    @NotBlank
    private String imageId;

    @NotBlank
    @URL(regexp = "^https:\\/\\/res\\.cloudinary\\.com\\/.*")
    private String imageUrl;

    @NotBlank
    private String imageDescription;

    @NotBlank
    private String imageTitle;
}
