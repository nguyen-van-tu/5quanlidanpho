public class Person {
    private String name;
    private int yearOfBirth;
    private String job;

    public Person(String name, int yearOfBirth, String job) {
        this.name = name;
        this.yearOfBirth = yearOfBirth;
        this.job = job;
    }

    public Person() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", yearOfBirth=" + yearOfBirth +
                ", job='" + job + '\'' +
                '}';
    }
}
