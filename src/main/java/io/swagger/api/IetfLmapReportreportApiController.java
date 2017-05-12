package io.swagger.api;

import io.swagger.model.Reportinput;

import io.swagger.annotations.*;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

import javax.validation.constraints.*;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-05-12T22:37:30.864Z")

@Controller
public class IetfLmapReportreportApiController implements IetfLmapReportreportApi {



    public ResponseEntity<Void> ietfLmapReportreportPost(@ApiParam(value = ""  ) @RequestBody Reportinput reportinput) {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

}
