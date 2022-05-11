package tw.com.fcb.mimosa.workshop.vaccine.ddd.infra.repository;

import tw.com.fcb.mimosa.workshop.vaccine.ddd.infra.assembler.ResidentProfileAssembler;
import tw.com.fcb.mimosa.workshop.vaccine.sharedkernel.ResidentProfile;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Copyright (C),2022,FirstBank
 * FileName: ResidentProfileRepositoryImpl
 * Author: Han-Ru
 * Date: 2022/5/8 下午 10:38
 * Description:
 */
@Repository
@RequiredArgsConstructor
public class ResidentProfileRepositoryImpl {

  final ResidentProfileAssembler assembler;

  @Override
  public List<ResidentProfile> findResidents() {
    return jpaResidentProfileRepository.findAll()
      .stream()
      .map(assembler::toProfile)
      .collect(Collectors.toList());
  }
}
