package org.example;

import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-07-24T20:55:58+0800",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 17.0.7 (Oracle Corporation)"
)
public class EmployeeMapperImpl implements EmployeeMapper {

    @Override
    public EmployeeDto entityToDto(Employee entity) {
        if ( entity == null ) {
            return null;
        }

        EmployeeDto employeeDto = new EmployeeDto();

        employeeDto.setNumber( entity.getId() );
        employeeDto.setLastName( entity.getLastName() );
        employeeDto.setDepartmentDto( departmentToDepartmentDto( entity.getDepartment() ) );

        return employeeDto;
    }

    @Override
    public Employee dtoToEntity(EmployeeDto dto) {
        if ( dto == null ) {
            return null;
        }

        Employee employee = new Employee();

        employee.setId( dto.getNumber() );
        employee.setLastName( dto.getLastName() );
        employee.setDepartment( departmentDtoToDepartment( dto.getDepartmentDto() ) );

        return employee;
    }

    protected DepartmentDto departmentToDepartmentDto(Department department) {
        if ( department == null ) {
            return null;
        }

        DepartmentDto departmentDto = new DepartmentDto();

        departmentDto.setId( department.getId() );
        departmentDto.setName( department.getName() );

        return departmentDto;
    }

    protected Department departmentDtoToDepartment(DepartmentDto departmentDto) {
        if ( departmentDto == null ) {
            return null;
        }

        Department department = new Department();

        department.setId( departmentDto.getId() );
        department.setName( departmentDto.getName() );

        return department;
    }
}
