package tw.com.fcb.mimosa.workshop.vaccine.ddd.infra.repository;

import java.time.LocalDateTime;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "EVENT_STORE")
public class EventEntity {

  @Id
  @GeneratedValue
  Long id;

  String eventType;
  LocalDateTime eventTime;
  Long aggregateId;

  // 以下可以是 JSON 格式的欄位
  String nhiNo;
  String phoneNo;

}
