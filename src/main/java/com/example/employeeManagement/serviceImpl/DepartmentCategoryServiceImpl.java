package com.example.employeeManagement.serviceImpl;

import com.example.employeeManagement.dto.DepartmentCategoryDto;
import com.example.employeeManagement.dto.DepartmentDto;
import com.example.employeeManagement.entity.Department;
import com.example.employeeManagement.entity.DepartmentCategory;
import com.example.employeeManagement.exception.ResourceNotFoundException;
import com.example.employeeManagement.repository.DepartmentCategoryRepository;
import com.example.employeeManagement.service.DepartmentCategoryService;
import com.example.employeeManagement.service.DepartmentService;
import com.example.employeeManagement.util.EntityDtoConverter;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DepartmentCategoryServiceImpl implements DepartmentCategoryService {

    private final DepartmentCategoryRepository departmentCategoryRepository;

    private final DepartmentService departmentService;

    private final EntityDtoConverter entityDtoConverter;

    public DepartmentCategoryServiceImpl(DepartmentCategoryRepository departmentCategoryRepository, DepartmentService departmentService, EntityDtoConverter entityDtoConverter) {
        this.departmentCategoryRepository = departmentCategoryRepository;
        this.departmentService = departmentService;
        this.entityDtoConverter = entityDtoConverter;
    }


    @Override
    public DepartmentCategoryDto addDepartmentCategory(DepartmentCategory departmentCategory, Integer deptId) {
        DepartmentDto departmentDto = departmentService.getDepartmentById(deptId);
        departmentCategory.setDepartment(entityDtoConverter.convert(departmentDto, Department.class));
        DepartmentCategory result = departmentCategoryRepository.save(departmentCategory);
        return entityDtoConverter.convert(result, DepartmentCategoryDto.class);
    }

    @Override
    public DepartmentCategoryDto getDepartmenCategoryById(Integer id) {
        Optional<DepartmentCategory> departmentCategoryOptional = departmentCategoryRepository.findById(id);
        return departmentCategoryOptional
                .map(departmentCategory -> entityDtoConverter.convert(departmentCategory, DepartmentCategoryDto.class))
                .orElseThrow(() -> new ResourceNotFoundException("Department Category Not Found"));
    }

    @Override
    public List<DepartmentCategoryDto> getAllDepartmentCategories() {
        return departmentCategoryRepository.findAll()
                .stream()
                .map(departmentCategory -> entityDtoConverter.convert(departmentCategory, DepartmentCategoryDto.class))
                .toList();
    }
}
