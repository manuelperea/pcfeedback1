package manueljesus.datalab.domain;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.cglib.core.Local;

import java.time.LocalDate;
import java.time.LocalDateTime;


@Data
@NoArgsConstructor
@Entity
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long jobId;
    private Integer shardIndex;

    @Enumerated(EnumType.STRING)
    private JobStatus status;

    private Integer attempts;   // Contador de reintentos

    private LocalDateTime startedAt;
    private LocalDateTime finishedAt;
    private String errorMessage;

    public Task(Long jobId, Integer  shardIndex) {
        this.jobId = jobId;
        this.shardIndex = shardIndex;
        this.status = JobStatus.PENDING;
        this.attempts = 0;
    }

}
