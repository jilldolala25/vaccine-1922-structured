package tw.com.fcb.mimosa.workshop.vaccine.ddd.userInterface.Api;

import tw.com.fcb.mimosa.workshop.vaccine.sharedkernel.ResidentProfile;

import java.util.List;

/**
 * Copyright (C),2022,FirstBank
 * FileName: QueryResidentApi
 * Author: Han-Ru
 * Date: 2022/5/8 下午 04:34
 * Description:
 */
public interface QueryResidentApi {

  @GetMapping
  List<ResidentProfile> getResidents();
}
