class JavaStrings {
    String str = "My Name is Piyush Makwana";
    String sub = "You are learning Java ";
    String admin = "My Name is Piyush Makwana";
    String adminLower = "my name is piyush makwana";
    String nullable = "";

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

    void getCharFrmString() {
        char[] df = new char[14];
        try {
            str.getChars(2, 15, df, 0);
            System.out.println(
                    "\n--> The string is from str we fetch using getChar method is in \ngetchar we use (4 parameter) \n1) is starting point \n2) ending point \n3) how many char want \n4)destination point ");
            System.out.println(df);

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    void getBytesfromstring() {
        byte[] bar = str.getBytes();
        System.out.println("\n");
        for (int i = 0; i < bar.length; i++) {
            System.out.println("--> " + bar[i]);
        }
        String f = new String(bar);
        System.out.println("-->  " + f);
    }

    void IndexofMethod() {
        System.out
                .println("\n--> indexOf method find the position of charcter or substring : " + str.indexOf("Makwana"));
    }

    void compareTo() {
        System.out.println("\n--> String Comparison 1 : " + str.compareTo(admin));
        System.out.println("\tString Comparison 2 : " + admin.compareTo(sub));
    }

    void concateString() {
        System.out.println("\n--> The concate string is 1 : " + str.concat(sub));
        System.out.println("\tsecond concate string is 2 : " + str.concat(" and i'm the admin of  cbiGujrat"));
    }

    void internMethod() {
        String st = new String("hello");
        String sm = "hello";
        String rs = st.intern();
        String sr = sm.intern();
        System.out.println("\n--> Intern the string : " + (rs == sr));
        System.out.println("\tIntern the string : " + (st == sm));
    }

    void checkEmptyorNot() {
        System.out.println("\n--> str is empty : " + str.isEmpty() + " and value of str : " + str);
        System.out.println("\tNullbale is empty : " + nullable.isEmpty());
    }

    void StringJoinMethod() {
        String demo = String.join(" * ", "Hello", "My", "name", "is", "Piyush");
        System.out.println("\n--> Exxample String Join method 1 : " + demo);

        String demo1 = String.join(" ^ ", "Hello", "Sir", "Thank", "You", "!");
        System.out.println("\tExxample String Join method 2 : " + demo1);
    }

    void splitString() {
        String[] words = str.split("\\s");
        System.out.println("\n--> The Split string is :) ");
        for (String a : words) {
            System.out.println(a);
        }
    }

    void trimStrimg() {
        System.out.println("\n--> Before triming The string is : " + sub + "And i'm the admin of cbiGujarat !");
        System.out.println("\t After triming The string is : " + sub.trim() + "And i'm the admin of cbiGujarat !");
    }

    void ValueOfMethod() {
        String piyush = new String(str);
        String ak = String.valueOf(piyush); // lookLike Assignment
        System.out.println("\n--> Example of ValueOf , The string is : " + ak);
    }

    void StringLcaseUcase() {
        System.out.println("\n--> First String is : " + admin + "\n\tSecond String is : " + adminLower
                + "\n\tin Lower case first string is : " + admin.toLowerCase()
                + "\n\tAnd In upper case second string is : " + adminLower.toUpperCase());
    }

    void SubStringMethod() {
        System.out.println("\n--> Example of Substring is 1 : " + str.substring(3));
        System.out.println("\tExample of Substring is 2 : " + str.substring(11, 17));
    }

    void ToCharArrayMethod() {
        System.out.println("\n--> The string is : " + str);
        char[] array = str.toCharArray();
        for (int j = 0; j < array.length; j++) {
            System.out.println(array[j]);
        }
        System.out.println(
                "\nIn Charcter array it's look like :) " + "\nit's length is : " + array.length + " Charcter !");
    }

    void StartwithCheck() {
        String Name = "Mr.Piyush Makwana";
        System.out.println("\n--> Is there your name is start with Dr. ? " + Name.startsWith("Dr.")
                + "\n\tSo which words to start Your name ?" + "\n\tohh it's " + Name.substring(0, 3));
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
        js.getCharFrmString();
        js.getBytesfromstring();
        js.IndexofMethod();
        js.compareTo();
        js.concateString();
        js.internMethod();
        js.checkEmptyorNot();
        js.StringJoinMethod();
        js.splitString();
        js.trimStrimg();
        js.ValueOfMethod();
        js.StringLcaseUcase();
        js.SubStringMethod();
        js.ToCharArrayMethod();
        js.StartwithCheck();
    }
}