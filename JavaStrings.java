class JavaStrings {
    String str = "My Name is Piyush Makwana";
    String sub = "You are learning Java ";
    String admin = "My Name is Piyush Makwana";
    String adminLower = "my name is piyush makwana";

    void stringExample1() {
        String s1 = "Hello Piyush !";
        char s2[] = { 'J', 'A', 'V', 'A', ' ', 'v', '2', '1', '.', '0', ' ', 'D', 'E', 'V' };
        String s3 = new String(s2);
        System.out.println("\nUser = " + s1);
        System.out.println("Build = " + s3);
    }

    void CharAtMethod() {
        System.out.println("\n--> Main string is : " + str);
        System.out.println("--> char at 5 Position = " + str.charAt(5));
    }

    void lengthOfString() {
        System.out.println("--> The length of the string is : " + str.length());
    }

    void stringFormat() {
        // String abc1 = String.format("format string is %x", 'a'); // error cuze x
        // isn't format as charcter
        String abc = String.format("--> format string is %c", 'A');
        System.out.println(abc);
    }

    void stringContaints() {
        if (str.contains(" check the string is avaible or not in str")) {
            System.out.println("--> good string is matched");
        } else {
            System.out.println("--> Dude your string is mismatched ! try again");
        }
    }

    void StringEndWith() {
        System.out.println(
                "\n--> your string is end with test ? " + str.endsWith("test") + "\n So your String is : " + str +
                        "\n and is it's end with makwana right !? " + str.endsWith("Makwana"));

    }

    void StringEquals() {
        System.out.println("\n--> Your String is : " + sub + "\n and it's equals to : " + str
                + "\n yrr it's diffrence let's check if it same than it will gives ou true either false : "
                + str.equals(sub) + "\n ok let's try anothe one the new string is admin : " + admin
                + "\n let try admin equals to Main String : " + admin.equals(str));
    }

    void EqualsIgnoreCase() {
        System.out.println(
                "\n--> above we can see string equals to string , \nlet's check String EqualsIgnoreCase !\n@lets try is guys The main Stirng is : "
                        + admin + "\n\t\t\t\t --- and ---" + "\nLower case string is : " + adminLower
                        + "\n main String is equals to lower casee string ? " + admin.equalsIgnoreCase(adminLower));
    }

    public static void main(String args[]) {
        JavaStrings js = new JavaStrings();
        js.stringExample1();
        js.CharAtMethod();
        js.lengthOfString();
        js.stringFormat();
        js.stringContaints();
        js.StringEndWith();
        js.StringEquals();
        js.EqualsIgnoreCase();
    }
}