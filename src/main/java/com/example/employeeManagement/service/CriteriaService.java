package com.example.employeeManagement.service;

import com.example.employeeManagement.dto.CriteriaDto;

import java.util.List;

public interface CriteriaService {

    CriteriaDto createCriteria(CriteriaDto criteriaDto,Integer postId);

    CriteriaDto getCriteriaById(Integer id);

    List<CriteriaDto> getAllCriteria();
}
