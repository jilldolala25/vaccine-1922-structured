package tw.com.fcb.mimosa.workshop.vaccine.ddd.userInterface.request;

import java.util.List;
import lombok.Data;
import tw.com.fcb.mimosa.workshop.vaccine.sharedkernel.Vaccine;

@Data
public class MakeAppointmentRequest {
  String nhiNo;
  String phoneNo;
  List<Vaccine> chooses;
}
