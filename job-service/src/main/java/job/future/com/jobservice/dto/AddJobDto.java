package job.future.com.jobservice.dto;

import jakarta.persistence.Column;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.RequiredArgsConstructor;


@Getter
@Builder
@RequiredArgsConstructor
public class AddJobDto {

    private String code;

    private String name;

    private String description;

    private String title;

    private String locationJob;

    private Double salaryAvg;


}
