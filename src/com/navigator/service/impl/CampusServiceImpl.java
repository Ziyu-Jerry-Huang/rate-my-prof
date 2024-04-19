package com.navigator.service.impl;

import com.navigator.entity.Campus;
import com.navigator.repository.CampusRepository;
import com.navigator.repository.impl.CampusRepositoryImpl;
import com.navigator.service.CampusService;
import java.util.List;

public class CampusServiceImpl implements CampusService {

  private CampusRepository campusRepository = new CampusRepositoryImpl();

  @Override
  public List<Campus> getAllCampus() {
    return campusRepository.getAllCampus();
  }
}
