class Person {
    // Instance Variables
    private String firstName;
    private String middleName;
    private String userName;

    // Methods
    //Setter for Name
    public void setUser(String fName, String mName, String uName) {
        firstName = fName;
        middleName = mName;
        userName = uName;
    }
    //Getter for Name
    public String getUser() {
        String user = firstName + " " + middleName + ": " + userName;
        return user;
    }


}
