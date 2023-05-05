public class Student {
    private String name, email, userName, passWord;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUserName() {
        System.out.println("bla bla bla");
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public Student(String name, String email, String userName, String passWord) {
        this.name = name;
        this.email = email;
        this.userName = userName;
        this.passWord = passWord;

    }
}
