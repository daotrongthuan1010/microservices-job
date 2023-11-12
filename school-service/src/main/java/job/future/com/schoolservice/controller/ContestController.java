package job.future.com.schoolservice.controller;

import org.springframework.cloud.client.loadbalancer.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/job/")
public class ContestController {

    @GetMapping("/test")
    public ResponseEntity<String> index(){
        return null;
    }
}
