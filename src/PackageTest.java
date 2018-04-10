/**
 * Created by Maciej Procyk on 10.04.2018.
 * Using the packages
 */

import com.procyk.corejava.*;
import static java.lang.System.*;

public class PackageTest {
    public static void main(String[] args){
        Employee harry = new Employee("Hubert Kowalski", 5000, 2012, 12, 30);
        out.println("name="+harry.getName() + " salary="+harry.getSalary());
        harry.raiseSalary(3);
        out.println("Po podwyżce:");
        out.println("name="+harry.getName() + " salary="+harry.getSalary());
    }
}
