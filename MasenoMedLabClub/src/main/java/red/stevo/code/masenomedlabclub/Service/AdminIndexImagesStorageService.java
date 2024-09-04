package red.stevo.code.masenomedlabclub.Service;

import jakarta.annotation.PostConstruct;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.http.support.HttpComponentsHeadersAdapter;
import org.springframework.stereotype.Service;
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

    private ImageRepository imageRepository;


    /*This Method receives image details from the controller and pushes them to the database.*/
    public ResponseEntity<UserGeneralResponse> storeUploadedImagesUrl(List<IndexPageImageModel> uploadedImage){
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
}
