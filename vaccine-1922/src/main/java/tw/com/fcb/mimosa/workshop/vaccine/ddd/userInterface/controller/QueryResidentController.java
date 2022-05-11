package tw.com.fcb.mimosa.workshop.vaccine.ddd.userInterface.controller;

import tw.com.fcb.mimosa.workshop.vaccine.ddd.application.query.QueryResidents;
import tw.com.fcb.mimosa.workshop.vaccine.ddd.application.usecase.ReplaceResidentProfileUseCase;
import tw.com.fcb.mimosa.workshop.vaccine.sharedkernel.ResidentProfile;

import java.util.List;

/**
 * Copyright (C),2022,FirstBank
 * FileName: QueryResidentController
 * Author: Han-Ru
 * Date: 2022/5/8 下午 04:36
 * Description:
 */
@RestController
@RequiredArgsConstructor
public class QueryResidentController {
  final QueryResidents query;

  final ReplaceResidentProfileUseCase useCases;

  @Override
  public List<ResidentProfile> getResidents() {
    return query.getResidents();
  }


}
