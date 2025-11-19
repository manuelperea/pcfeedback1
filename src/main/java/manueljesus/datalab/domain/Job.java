package manueljesus.datalab.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDateTime;


@Data
@NoArgsConstructor
@Entity
public class Job {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDateTime createdAt;

    @Enumerated(EnumType.STRING)
    private JobStatus status;

    private Integer totalTasks;
    private Integer completedTasks;
    private Integer failedTasks;

    private String paramsJson;

    private boolean cancelled = false;

    public Job(String paramsJson, Integer totalTasks) {
        this.createdAt = LocalDateTime.now();
        this.status = JobStatus.PENDING;
        this.totalTasks = totalTasks;
        this.completedTasks = 0;
        this.failedTasks = 0;
        this.paramsJson = paramsJson;
    }
}
