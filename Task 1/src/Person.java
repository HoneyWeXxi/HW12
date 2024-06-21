public class Person {
    private String name;
    private String post;
    private String placeWork;
    private int age;
    private int salary;
    public Person(){

    }

    public Person(String name, String post, String placeWork, int age, int salary) {
        this.name = name;
        this.post = post;
        this.placeWork = placeWork;
        this.age = age;
        this.salary = salary;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getPlaceWork() {
        return placeWork;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setPlaceWork(String placeWork) {
        this.placeWork = placeWork;
    }

    public int getAge() {
        return age;
    }

    public int getSalary() {
        return salary;
    }

}
