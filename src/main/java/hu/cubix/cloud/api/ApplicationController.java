package hu.cubix.cloud.api;

import hu.cubix.cloud.model.CubixResponse;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
@RequestMapping("/")
public class ApplicationController {

    @GetMapping("/cubix/test")
    public CubixResponse demoMessage(@RequestParam(required = false, name = "message") String message) {
        if (!StringUtils.hasText(message)) {
            message = "This is a default message";
        }
        return new CubixResponse(LocalDateTime.now(), message);
    }

}
