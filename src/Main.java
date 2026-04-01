public class Main {

    public static void main(String[] args) {

        Employee e1 = new Employee("Wipro");
        Employee e2 = new Employee("Wipro");
        e2.SetOrganization("Rini");
        System.out.println(e1.Organization);
        System.out.println(e2.Organization);

    }
}
class Employee{

    public String Organization;
    public Employee(String o){
        Organization=o;
    }
    public void SetOrganization(String o)
    {
        Organization=o;
    }
}