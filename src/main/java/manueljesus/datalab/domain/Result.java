package manueljesus.datalab.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
public class Result {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long jobId;
    private Integer shardIndex;
    private String payloadJson; // El resumen parcial en formato JSON

    public Result(Long jobId, Integer shardIndex, String payloadJson) {
        this.jobId = jobId;
        this.shardIndex = shardIndex;
        this.payloadJson = payloadJson;
    }
}
