package job.future.com.jobservice.service.serviceIpm;

import jdk.jfr.Category;
import job.future.com.jobservice.dto.AddJobDto;
import job.future.com.jobservice.entity.Job;
import job.future.com.jobservice.repository.JobRepository;
import job.future.com.jobservice.service.JobService;
import job.future.com.jobservice.utils.CreateCodeJob;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class JobServiceIpm implements JobService {

    private final JobRepository jobRepository;

    @Override
    public void add(AddJobDto job) {

        jobRepository.save(Job.builder()
                        .code(new CreateCodeJob().generateJobCode())
                        .title(job.getTitle())
                        .description(job.getDescription())
                        .name(job.getName())
                        .locationJob(job.getLocationJob())
                        .salaryAvg(job.getSalaryAvg())
                .build());

    }

    @Override
    public void searchJob(Long id) {

    }

    @Override
    public void deleteJob(Long id) {

    }
}
