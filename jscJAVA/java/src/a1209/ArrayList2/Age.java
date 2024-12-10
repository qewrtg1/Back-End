package a1209.ArrayList2;

public class Age {
    private String person;
    private int age;
    private String personId;
    public String getPerson() {
        return person;
    }
    public void setPerson(String person) {
        this.person = person;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getPersonId() {
        return personId;
    }
    public void setPersonId(String personId) {
        this.personId = personId;
    }
    public Age(){
        
    }
    public Age(String person, int age, String personId) {
        this.person = person;
        this.age = age;
        this.personId = personId;
    }
    @Override
    public String toString() {
        return "Age [person=" + person + ", age=" + age + ", personId=" + personId + "]";
    }
}
