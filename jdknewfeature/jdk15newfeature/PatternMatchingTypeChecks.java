package jdknewfeature.jdk15newfeature;

import org.junit.jupiter.api.Test;

public class PatternMatchingTypeChecks {

    public class Person {}
    public class Employee extends Person {
        public int getYearsOfService() {
            return yearsOfService;
        }

        public void setYearsOfService(int yearsOfService) {
            this.yearsOfService = yearsOfService;
        }

        private int yearsOfService;
        public Employee(int yearsOfService) {
            this.yearsOfService = yearsOfService;
        }
    }

    @Test void test() {
        Person person = new Employee(6);
        if (person instanceof Employee employee && employee.getYearsOfService() > 5) {
            System.out.println("true");
        }
    }
}
