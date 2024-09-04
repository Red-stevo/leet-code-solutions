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
import red.stevo.code.masenomedlabclub.Service.AdminService;

import java.util.List;
import java.util.logging.Logger;

@Slf4j
@RequestMapping("/admin")
@RequiredArgsConstructor
public class AdminController {
    private AdminService adminService;

    /*This end point handles storing of url, name and description of the upload images.
    * These values are received from the from end provided by the cloudinary API.*/
    public ResponseEntity<UserGeneralResponse> uploadedImage(
            @NonNull @RequestBody List<IndexPageImageModel> uploadedImage){
        log.info("Request to store upload images");


        return null;
    }
}
