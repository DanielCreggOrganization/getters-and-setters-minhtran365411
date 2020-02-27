class Person {
    // Instance Variables
    private String firstName;
    private String middleName;
    private String userName;
    private String[] middleNames;


    // Methods
    //Setter for Name
    public void setUser(String fName, String mName, String uName) {
        firstName = fName;
        middleName = mName;
        if (uName.length() > 10 ) {
            userName = uName.substring(0, 10);
        } else {
            userName = uName;
        }
        
    }

    //Setter for array middleName
    public void setMiddleNames(String middleNames) {
        this.middleNames = middleNames.split(" ");
    }

    //Getter for Name
    public String getUser() {
        String user = firstName + " " + middleName + ": " + userName;
        return user;
    }

    //Getter for array middleName
    public String getMiddleNames() {
        StringBuffer sb = new StringBuffer();
        for(int i = 0; i < middleNames.length; i++) {
            sb.append(middleNames[i] + " ");
        }
        String middleNames = sb.toString();
        return middleNames;
    }


}
