package org.example;

/*
@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-07-24T20:53:12+0800",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 17.0.7 (Oracle Corporation)"
)
*/
public class DepartmentMapperImpl implements DepartmentMapper {

    @Override
    public DepartmentDto entityToDto(Department entity) {
        if ( entity == null ) {
            return null;
        }

        DepartmentDto departmentDto = new DepartmentDto();

        departmentDto.setId( entity.getId() );
        departmentDto.setName( entity.getName() );

        return departmentDto;
    }

    @Override
    public Department dtoToEntity(DepartmentDto dto) {
        if ( dto == null ) {
            return null;
        }

        Department department = new Department();

        department.setId( dto.getId() );
        department.setName( dto.getName() );

        return department;
    }
}
