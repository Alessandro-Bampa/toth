package beans.response;

import java.util.Date;

public class ResponseExample {

    private String name;

    private String surname;

    private Date dbo;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Date getDbo() {
        return dbo;
    }

    public void setDbo(Date dbo) {
        this.dbo = dbo;
    }
}
