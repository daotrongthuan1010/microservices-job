package job.future.com.jobservice.controller;

import jakarta.validation.Valid;
import job.future.com.jobservice.dto.AddJobDto;
import job.future.com.jobservice.service.JobService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/job")
public class JobController {

    private final RestTemplate restTemplate;

    private final JobService jobService;

    // commit 1

    // commit 2

    // commit 3

    @GetMapping("/add")
    public ResponseEntity<Void> addJob(@Valid  @RequestBody AddJobDto addJobDto){

        jobService.add(addJobDto);

        return ResponseEntity.ok(null);

    }
}
