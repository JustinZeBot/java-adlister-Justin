package BeanLectures;

public class CreateAEmployeeJavaBean {

    public static void main (String[]args ){

        Employee employee=new Employee();

        employee.setFirstName("Justin");

        System.out.println("java bean data : " + employee.getFirstName() );
    }
}
