package lambdaexpression.Task;
import java.util.Arrays;
import java.util.Comparator;

class sortArray {
 public static void main(String[] args) {

    Person[] people = {
      new Person("Anu", 20),
      new Person("Kalyani", 22),
      new Person("sandhiya", 18),
      new Person("raghul", 20)
    };

    Arrays.sort(people, Comparator.comparingInt(Person::getAge));

    for (Person person : people) {
      System.out.println(person);
    }
 }
}

class Person {
 private String name;
 private int age;

 public Person(String name, int age) {
    this.name = name;
    this.age = age;
 }

 public String getName() {
    return name;
 }

 public int getAge() {
    return age;
 }

 @Override
 public String toString() {
    return name + ", " + age;
 }
}
