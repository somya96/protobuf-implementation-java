import com.google.protobuf.ByteString;

import generated.Person.Employee;
import generated.Person.Employee.Address;
import generated.Person.Employee.Nationality;

public class ProtobufImplementation {

    public static void main(String[] args) {
        try {
            Employee employee = createEmployee();
            ByteString empByteString = employee.toByteString();
            System.out.println(empByteString);

            Employee employee2 = Employee.parseFrom(empByteString);

            System.out.println(employee2.getName());
            System.out.println(employee2.getPhoneNumber());
        } catch (Exception e) {

        }
    }

    public static Employee createEmployee() {
        Employee.Builder employee = Employee.newBuilder();
        employee.setId(123);
        employee.setName("Somya");

        Employee.Address.Builder address = Address.newBuilder();
        address.setCity("Hapur");
        employee.setAddress(address);

        employee.setNationality(Nationality.INDIAN);

        employee.setPhoneNumber("8126503181");

        return employee.build();
    }
}