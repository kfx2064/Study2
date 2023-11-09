package com.uno.getinline.controller.api;

import com.uno.getinline.constant.PlaceType;
import com.uno.getinline.dto.APIDataResponse;
import com.uno.getinline.dto.PlaceDTO;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api")
@RestController
public class APIPlaceController {

//    @GetMapping("/places")
//    public APIDataResponse<List<PlaceDTO>> getPlaces() {
//        return APIDataResponse.of(List.of(PlaceDTO.of(
//                PlaceType.COMMON
//                , "랄라베드민턴점"
//                , "서울시 강남구 강남대로점"
//                , "010-1234-1234"
//                , 30
//                , "신장개업"
//        )));
//    }
//
//    @PostMapping("/places")
//    public Boolean createPlace() {
//        return true;
//    }
//
//    @GetMapping("/places/{placeId}")
//    public APIDataResponse<PlaceDTO> getPlace(@PathVariable Integer placeId) {
//
//        if (placeId.equals(2)) {
//            return APIDataResponse.of(null);
//        }
//
//        return APIDataResponse.of((PlaceDTO.of(
//                PlaceType.COMMON
//                , "랄라베드민턴점"
//                , "서울시 강남구 강남대로점"
//                , "010-1234-1234"
//                , 30
//                , "신장개업"
//        )));
//    }

    @PutMapping("/places/{placeId}")
    public Boolean modifyPlace(@PathVariable Integer placeId) {
        return true;
    }

    @DeleteMapping("/places/{placeId}")
    public Boolean removePlace(@PathVariable Integer placeId) {
        return true;
    }
}
