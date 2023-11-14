package job.future.com.jobservice.repository;

import job.future.com.jobservice.entity.JobPath;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JobPathRepository extends JpaRepository<JobPath, Long> {

}
