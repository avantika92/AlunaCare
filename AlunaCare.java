public class AlunaCare {
    public static String username(String fName, String lName, String dob, String gender)
    {
        String username;
        if(fName.length()>=2 && lName.length()>=2) {
            username = fName.substring(0, 2) + lName.substring(0, 2) + dob.substring(0, 4) + gender.charAt(0);
        }
        else {
            username = fName + lName + dob.substring(0, 4) + gender.charAt(0);
        }
        System.out.print(username.toUpperCase());
        return username;
    }
    public static void main(String args[]){
        String fName = "Jn";
        String lName = "G";
        String dob = "2016-07-31";
        String gender = "Female";
        username(fName,lName,dob,gender);
    }
}
