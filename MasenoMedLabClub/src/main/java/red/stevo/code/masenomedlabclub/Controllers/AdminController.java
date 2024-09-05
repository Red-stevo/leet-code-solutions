package red.stevo.code.masenomedlabclub.Controllers;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import red.stevo.code.masenomedlabclub.Models.RequestModels.IndexPageImageModel;
import red.stevo.code.masenomedlabclub.Models.ResponseModel.UserGeneralResponse;
import red.stevo.code.masenomedlabclub.Service.AdminIndexImagesStorageService;

import java.util.List;

@Slf4j
@RequestMapping("/apis/admin")
@RequiredArgsConstructor
@RestController
public class AdminController {
    private final AdminIndexImagesStorageService adminIndexImagesStorageService;

    /*This end point handles storing of url, name and description of the upload images.
    * These values are received from the font-end provided by the cloudinary API.*/
    @PostMapping("/save/images")
    public ResponseEntity<UserGeneralResponse>
    uploadedImage(@RequestBody @Validated List<IndexPageImageModel> uploadedImage){
        log.info("Request to store upload images");
        return adminIndexImagesStorageService.storeUploadedImagesUrl(uploadedImage);
    }

    /*This API will handle fetching index page saved image urls,
    * description, image titles and their ids.
    * Returns a list of all available images in the table.*/
    @GetMapping("/get-all/images")
    public ResponseEntity<List<IndexPageImageModel>> getAllSavedImages(){
        log.info("Getting Index page Images.");
        return adminIndexImagesStorageService.getAllIndexPageImages();
    }

    @DeleteMapping("/delete/image/{image-id}")
    public ResponseEntity<UserGeneralResponse> deleteIndexPAgeImage(@PathVariable ("image-id")String imageId){
        log.info("Request to delete index image.");


        return null;
    }
}
