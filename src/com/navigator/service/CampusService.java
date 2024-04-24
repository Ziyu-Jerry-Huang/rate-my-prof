package com.navigator.service;

import com.navigator.entity.Campus;
import java.util.List;
/**
 * Service interface for Campus service.
 */
public interface CampusService {
    /**
     * Get all campuses.
     *
     * @return List of all campuses.
     */
  List<Campus> getAllCampus();
}
