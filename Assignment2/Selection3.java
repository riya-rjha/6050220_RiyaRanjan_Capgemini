public class Selection3 {

    static class Employee {
        String name;
        int age;
        float rating;

        public Employee(String name, int age, float rating) {
            this.name = name;
            this.age = age;
            this.rating = rating;
        }
    }

    public static void swap(Employee[] emp, int id1, int id2) {
        Employee temp = emp[id1];
        emp[id1] = emp[id2];
        emp[id2] = temp;
    }

    public static void main(String[] args) {
        Employee[] empData = {
                new Employee("Robert", 27, 5.55f),
                new Employee("Frost", 29, 9.43f),
                new Employee("David", 35, 9.31f),
                new Employee("Ghazal", 44, 6.44f),
                new Employee("Anupam", 39, 8.28f),
                new Employee("Aman", 39, 9.28f),
                new Employee("Namita", 44, 9.31f),
                new Employee("Ashneer", 24, 6.44f)
        };

        for (int i = 0; i < empData.length - 1; i++) {
            int minPos = i;

            for (int j = i + 1; j < empData.length; j++) {
                float currRating = empData[minPos].rating;
                float nextRating = empData[j].rating;

                int currAge = empData[minPos].age;
                int nextAge = empData[j].age;

                if (currRating < nextRating) {
                    // rating descending
                    minPos = j;
                } else if (currRating == nextRating && currAge > nextAge) {
                    // age ascending if rating equal
                    minPos = j;
                }
            }

            swap(empData, i, minPos);
        }

        for (Employee employee : empData) {
            System.out.println(
                    "Name: " + employee.name +
                            " Age: " + employee.age +
                            " Rating: " + employee.rating);
        }
    }
}
