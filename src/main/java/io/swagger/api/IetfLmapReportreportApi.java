package io.swagger.api;

import io.swagger.model.Reportinput;

import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import javax.validation.constraints.*;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-05-12T22:37:30.864Z")

@Api(value = "ietf-lmap-report:report", description = "the ietf-lmap-report:report API")
public interface IetfLmapReportreportApi {

    @ApiOperation(value = "Invokes report in ietf-lmap-report", notes = "The report operation is used by an LMAP measurement agent to submit measurement results produced by measurement tasks to a collector.", response = Void.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Expected response of report", response = Void.class) })
    @RequestMapping(value = "/ietf-lmap-report:report",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<Void> ietfLmapReportreportPost(@ApiParam(value = ""  ) @RequestBody Reportinput reportinput);

}
