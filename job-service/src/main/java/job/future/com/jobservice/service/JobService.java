package job.future.com.jobservice.service;

import job.future.com.jobservice.dto.AddJobDto;
import job.future.com.jobservice.entity.Job;

public interface JobService {

    void add(AddJobDto job);

    void searchJob(Long id);

    void deleteJob(Long id);


}
