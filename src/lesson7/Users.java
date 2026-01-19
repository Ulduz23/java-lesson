package lesson7;

class Users {
    private String name;
    private int age;
    private boolean active;

    @Override
    public String toString() {
        return "Users{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", active=" + active +
                '}';
    }

    public Users(String name, int age, boolean active) {
        this.name = name;
        this.age = age;
        this.active = active;
    }

    public int getAge() { return age; }
    public boolean isActive() { return active; }
    public String getName() { return name; }


}
