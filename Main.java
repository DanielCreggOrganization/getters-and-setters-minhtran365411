public class Main {
    // Main method
    public static void main(String[] args) {
        //create a person
            Person userObj1 = new Person();
            //calling setter
            userObj1.setUser("Minh","Tran Nguyen Phuong", "minhtran365411");
            //calling getter
            System.out.println(userObj1.getUser());

        //create a person
            Person userObj2 = new Person();
            //calling setter
            userObj2.setUser("Meryl","Streep", "gorgeousMeryl");
            //calling getter
            System.out.println(userObj2.getUser());

        //create a person
            Person userObj3 = new Person();
            //calling setter
            userObj3.setMiddleNames("Nguyen Phuong");
            //calling getter
            System.out.println(userObj3.getMiddleNames());
    }
}
