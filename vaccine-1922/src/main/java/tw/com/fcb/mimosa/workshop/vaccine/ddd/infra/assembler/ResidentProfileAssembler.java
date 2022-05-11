package tw.com.fcb.mimosa.workshop.vaccine.ddd.infra.assembler;

import tw.com.fcb.mimosa.workshop.vaccine.ddd.application.command.ReplaceResidentProfile;
import tw.com.fcb.mimosa.workshop.vaccine.ddd.infra.repository.ResidentEntity;
import tw.com.fcb.mimosa.workshop.vaccine.ddd.infra.repository.ResidentProfileEntity;
import tw.com.fcb.mimosa.workshop.vaccine.ddd.userInterface.request.ReplaceResidentProfileRequest;
import tw.com.fcb.mimosa.workshop.vaccine.sharedkernel.ResidentProfile;

/**
 * Copyright (C),2022,FirstBank
 * FileName: ResidentProfileAssembler
 * Author: Han-Ru
 * Date: 2022/5/8 下午 10:20
 * Description:
 */
@Mapper
public interface ResidentProfileAssembler {
  @Mapping(target = "id", ignore = true)
  ResidentProfileEntity copyProfileEntity(ResidentEntity resident,
                                          @MappingTarget ResidentProfileEntity profile);

  @Mapping(target = "residentId", source = "id")
  ResidentProfileEntity toProfileEntity(ResidentEntity resident);

  ResidentProfile toProfile(ResidentProfileEntity profileEntity);

  ReplaceResidentProfile toReplaceResidentProfileCommand(ReplaceResidentProfileRequest request);

}

