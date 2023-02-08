public class Student {
    int id;
    String name,email,address,current_course;
    String year;
    String branch;

    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }

    public String getCurrent_course() {
        return current_course;
    }

    public String getYear() {
        return year;
    }

    public String getBranch() {
        return branch;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setCurrent_course(String current_course) {
        this.current_course = current_course;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }
}
