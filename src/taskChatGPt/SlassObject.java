package taskChatGPt;
//Создайте класс Student с полями fullName и grades, где grades - это массив оценок.
// Определите метод getAverageGrade() для вычисления средней оценки и метод printDetails()
// для вывода на консоль имени студента и средней оценки. Создайте объект Student и
// выведите на консоль его имя и среднюю оценку.
public class SlassObject {
    public static class Student {
        private String fullName;
        private int[] grades;

        public Student(String fullName, int[] grades) {
            this.fullName = fullName;
            this.grades = grades;
        }

        public double getAverageGrade() {
            double sum = 0;
            for (int grade : grades) {
                sum += grade;
            }
            return sum / grades.length;
        }

        public void printDetails() {
            System.out.println("Имя студента: " + fullName);
            System.out.println("Средняя оценка: " + getAverageGrade());
        }
    }

    public class Main {
        public static void main(String[] args) {
            int[] grades = {85, 90, 95, 98, 100};
            Student student = new Student("Иван Иванов", grades);
            student.printDetails();
        }
    }
    }

