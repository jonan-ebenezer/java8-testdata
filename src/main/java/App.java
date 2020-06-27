import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class App {

    public static void main(String[] args) {



        try {
            List <Employee>  employees = MockDataUtil.getEmployees();
            System.out.println("Before sorting");
            employees.stream().forEach(System.out::println);
            Collections.sort(employees,(e1,e2) -> (e1.getFirstName().compareTo(e2.getFirstName())));
            System.out.println("After sorting");
            employees.stream().forEach(System.out::println);


        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
