package tw.com.fcb.mimosa.workshop.vaccine.ddd.userInterface.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;
import tw.com.fcb.mimosa.ext.ddd.application.UseCases;
import tw.com.fcb.mimosa.workshop.vaccine.ddd.application.ApplicationService;
import tw.com.fcb.mimosa.workshop.vaccine.ddd.application.usecase.ReplaceResidentProfileUseCase;
import tw.com.fcb.mimosa.workshop.vaccine.ddd.infra.assembler.ResidentAssembler;
import tw.com.fcb.mimosa.workshop.vaccine.ddd.infra.assembler.ResidentProfileAssembler;
import tw.com.fcb.mimosa.workshop.vaccine.ddd.userInterface.request.CancelVaccineRequest;
import tw.com.fcb.mimosa.workshop.vaccine.ddd.userInterface.request.ChooseVaccineRequest;
import tw.com.fcb.mimosa.workshop.vaccine.ddd.userInterface.request.MakeAppointmentRequest;
import tw.com.fcb.mimosa.workshop.vaccine.ddd.userInterface.request.ReplaceResidentProfileRequest;
import tw.com.fcb.mimosa.workshop.vaccine.ddd.userInterface.Api.ResidentApi;

@RestController
@RequiredArgsConstructor
class ResidentController implements ResidentApi {

  final ApplicationService service;
  final ResidentAssembler assembler;
  final ReplaceResidentProfileUseCase useCases;
  final ResidentProfileAssembler residentProfileAssembler;


  @Override
  public long makeAppointment(MakeAppointmentRequest request) {
    var command = assembler.toMakeAppointmentCommand(request);
    return service.makeAppointment(command);
  }

  @Override
  public void chooseVaccine(long id, ChooseVaccineRequest request) {
    var command = assembler.toChooseVaccineCommand(request);
    command.setId(id);
    useCases.execute(command);
    //    service.chooseVaccine(command);
  }

  @Override
  public void cancelVaccine(long id, CancelVaccineRequest request) {
    var command = assembler.toCancelVaccineCommand(request);
    command.setId(id);
    //    service.cancelVaccine(command);
    useCases.execute(command);

    @Override
    public void replaceResidentProfile(long id,
    ReplaceResidentProfileRequest request) {
      var command = residentProfileAssembler.toReplaceResidentProfileCommand(request);
      command.setId(id);
      useCases.execute(command);
    }
  }




}
