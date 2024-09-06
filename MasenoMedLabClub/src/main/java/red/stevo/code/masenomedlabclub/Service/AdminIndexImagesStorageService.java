package red.stevo.code.masenomedlabclub.Service;

import jakarta.annotation.PostConstruct;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.http.support.HttpComponentsHeadersAdapter;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;
import red.stevo.code.masenomedlabclub.Entities.IndexPageImages;
import red.stevo.code.masenomedlabclub.Models.RequestModels.IndexPageImageModel;
import red.stevo.code.masenomedlabclub.Models.ResponseModel.UserGeneralResponse;
import red.stevo.code.masenomedlabclub.Repositories.ImageRepository;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

@Data
@Service
@Slf4j
@RequiredArgsConstructor
public class AdminIndexImagesStorageService {

    private final ImageRepository imageRepository;


    /*This Method receives image details from the controller and pushes them to the database.*/
    public ResponseEntity<UserGeneralResponse>
    storeUploadedImagesUrl(@Validated List<IndexPageImageModel> uploadedImage){
        log.info("Processing passed urls for storage.");


        /*Mapping the Images details passed to Image table Object and returning them to the list.*/
        List<IndexPageImages> indexPageImages = uploadedImage.stream().map((imageModel)
        -> new IndexPageImages(imageModel.getImageId(), imageModel.getImageUrl(),
                imageModel.getImageTitle(), imageModel.getImageDescription())).toList();

        /*Save the list of image entity to the database.*/
        imageRepository.saveAll(indexPageImages);
        log.info("Images Saved Successfully");

        /*Preparing user response.*/
        UserGeneralResponse userGeneralResponse = new UserGeneralResponse();
        userGeneralResponse.setMessage("Images Saved.");
        userGeneralResponse.setDate(new Date());
        userGeneralResponse.setHttpStatus(HttpStatus.OK);

        return new ResponseEntity<>(userGeneralResponse, HttpStatus.OK);
    }

    /*This Method will fetch all index images details stored in the
    * database and map them to the IndexPageImageModel and return them to the user.*/
    @Cacheable(value ="IndexPageImages")
    public ResponseEntity<List<IndexPageImageModel>> getAllIndexPageImages(){
        log.info("Processing index images fetch requests");

        List<IndexPageImageModel> imageDetails = new ArrayList<>();

        imageRepository.findAll().forEach((image) -> {
            IndexPageImageModel indexPageImageModel = new
                    IndexPageImageModel(image.getId(), image.getUrl(), image.getDescription(), image.getName());
            imageDetails.add(indexPageImageModel);
        });

        return new ResponseEntity<>(imageDetails, HttpStatus.OK);
    }

    @CacheEvict(value = "IndexPageImages", allEntries =true )
    public ResponseEntity<UserGeneralResponse> deleteIndexPageImage(String imageId){
        log.info("Processing image for deletion.");

        /*delete image.*/
        imageRepository.deleteById(imageId);

        UserGeneralResponse userGeneralResponse = new UserGeneralResponse();
        userGeneralResponse.setHttpStatus(HttpStatus.OK);
        userGeneralResponse.setDate(new Date());
        userGeneralResponse.setMessage("Image deleted successfully.");

        return new ResponseEntity<>(userGeneralResponse, HttpStatus.OK);
    }
}
