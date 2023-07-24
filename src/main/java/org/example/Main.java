package org.example;

public class Main {
    public static void main(String[] args) {
        DepartmentMapperImpl mapper = new DepartmentMapperImpl();
        DepartmentDto dto = new DepartmentDto();
        dto.setId("id001");
        dto.setName("King");
        Department entity = mapper.dtoToEntity(dto);
        System.out.println(entity.toString());
        //--------
        EmployeeMapperImpl employeeMapper = new EmployeeMapperImpl();
        EmployeeDto employeeDto = new EmployeeDto();
        employeeDto.setNumber("1234");
        employeeDto.setLastName("Jackson");
        employeeDto.setDepartmentDto(dto);
        Employee employee = employeeMapper.dtoToEntity(employeeDto);
        System.out.println(employee);



    }
}