package red.stevo.code.masenomedlabclub.Controllers;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import red.stevo.code.masenomedlabclub.Models.RequestModels.IndexPageImageModel;
import red.stevo.code.masenomedlabclub.Models.ResponseModel.UserGeneralResponse;
import red.stevo.code.masenomedlabclub.Service.AdminIndexImagesStorageService;

import java.util.List;

@Slf4j
@RequestMapping("/admin")
@RequiredArgsConstructor
public class AdminController {
    private AdminIndexImagesStorageService adminIndexImagesStorageService;

    /*This end point handles storing of url, name and description of the upload images.
    * These values are received from the font-end provided by the cloudinary API.*/
    public ResponseEntity<UserGeneralResponse> uploadedImage( @Validated
            @NonNull @RequestBody List<IndexPageImageModel> uploadedImage){
        log.info("Request to store upload images");


        return adminIndexImagesStorageService.storeUploadedImagesUrl(uploadedImage);
    }
}
