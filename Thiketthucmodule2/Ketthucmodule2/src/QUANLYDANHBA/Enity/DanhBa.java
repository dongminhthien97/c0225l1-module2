package QUANLYDANHBA.Enity;

public class DanhBa {
    protected String tel;
    protected String group;
    protected String name;
    protected String sex;
    protected String adress;;
    protected String birthday;
    protected String email;

    public DanhBa() {}

    public DanhBa(String tel, String group, String name, String sex, String adress, String birthday, String email) {
        this.tel = tel;
        this.group = group;
        this.name = name;
        this.sex = sex;
        this.adress = adress;
        this.birthday = birthday;
        this.email = email;
    }

    public String getTel() {
        return tel;
    }

    public String getGroup() {
        return group;
    }

    public String getName() {
        return name;
    }

    public String getSex() {
        return sex;
    }

    public String getAdress() {
        return adress;
    }

    public String getBirthday() {
        return birthday;
    }

    public String getEmail() {
        return email;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "DanhBa{" +
                "tel='" + tel + '\'' +
                ", group='" + group + '\'' +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", adress='" + adress + '\'' +
                ", birthday='" + birthday + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public String toCSV() {
        return this.getTel() + "," + this.getGroup() + "," + this.getName() + "," +
                this.getSex() + "," + this.getAdress() + "," + this.getBirthday() + "," + this.getEmail();
    }

}
