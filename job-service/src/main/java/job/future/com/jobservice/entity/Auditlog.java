package job.future.com.jobservice.entity;


import jakarta.persistence.*;
import job.future.com.jobservice.utils.DateTimeUtils;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.io.Serializable;
import java.time.LocalDateTime;


@EntityListeners(AuditingEntityListener.class)
@MappedSuperclass
public class Auditlog implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @CreatedBy
    @Column(name = "created_by")
    private String createUser;

    @CreatedDate
    @Column(name = "creation_date")
    private LocalDateTime createDateTime;

    @LastModifiedBy
    @Column(name = "last_updated_by")
    private String updateUser;

    @LastModifiedDate
    @Column(name = "last_update_date")
    private LocalDateTime updateDateTime;

    public void createDateTime(LocalDateTime createDateTime, String timeZone) {
        this.createDateTime = DateTimeUtils.convertToUTC(createDateTime, timeZone);
    }

    public void setEndTime(LocalDateTime updateDateTime, String timeZone) {
        this.updateDateTime = DateTimeUtils.convertToUTC(updateDateTime, timeZone);
    }
}
