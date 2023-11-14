package job.future.com.jobservice.entity;

import jakarta.persistence.*;
import lombok.*;


@Entity
@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "job")
public class Job extends Auditlog {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "code")
    private String code;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    @Column(name = "title")
    private String title;

    @Column(name = "location_job")
    private String locationJob;

    @Column(name = "salary_avg")
    private Double salaryAvg;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "job_path_id", referencedColumnName = "id")
    private JobPath jobPath;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "job_category_id", referencedColumnName = "id")
    private JobCategory jobCategory;
}
