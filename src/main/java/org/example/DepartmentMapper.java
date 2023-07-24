package org.example;

import org.mapstruct.Mapper;

@Mapper
public interface DepartmentMapper {

    DepartmentDto entityToDto(Department entity);
    Department dtoToEntity(DepartmentDto dto);
}
