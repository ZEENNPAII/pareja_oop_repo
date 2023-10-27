package Students;

class Student {

    String First_Name = "";
    String Middle_Name = "";
    String Last_Name = "";
    String suffix = "";

    public Student() {
    }

    public String getFirstname() {
        return First_Name;
    }

    public void setFirstname(String firstname) {
        this.First_Name = firstname;
    }

    public String getMiddlename() {
        return Middle_Name;
    }

    public void setMiddlename(String middlename) {
        this.Middle_Name = middlename;
    }

    public String getLastname() {
        return Last_Name;
    }

    public void setLastname(String lastname) {
        this.Last_Name = lastname;
    }

    public String getSuffix() {
        return suffix;
    }

    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }

    public String getFullName() {
        return First_Name + " " + Middle_Name + " " + Last_Name + " " + suffix;
    }
}
