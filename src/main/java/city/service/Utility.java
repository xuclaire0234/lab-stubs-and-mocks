package city.service;
import salary.service.City;
import salary.service.Salary;
import java.util.ArrayList;
import java.util.List;

public class Utility {
    public List<Address> getAddressesByCity(City city, String cityName) {
        List<Address> addresses = new ArrayList<>();
        List<Address> cityAddresses = city.listAddresses();

        for (int i = 0; i < cityAddresses.size(); i++) {
            if (cityAddresses.get(i).city.equals(cityName)) {
                addresses.add(cityAddresses.get(i));
            }
        }
        return addresses;
    }

    public List<Integer> getSalariesOver(Salary employeeSalary, Integer filter) {
        List<Integer> salaries = employeeSalary.returnSalaries();
        List<Integer> filterSalaries = new ArrayList<>();
        for (Integer salary : salaries ) { // this for loop is for each salary in salaries
            if (salary > filter) {  // if salary is greater than filter, add to filterSalaries
                filterSalaries.add(salary);
            }
        }
        return filterSalaries; // return the filtered salaries, which are greater than filter
    }
}
