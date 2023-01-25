public class nameOverloading {
    public static void main (String[] args){
        myMethod();

        myMethod("Harry");
        myMethod("John");
        myMethod("Lily");
        myMethod("Ada", "Lovelace");
        myMethod("Eugene", "Flynn", "Fitzherbert");
    }
    static void myMethod(){
        System.out.println("Any name is  a good name.");
    }

    static void myMethod(String fName){
        System.out.println(fName + " Potter");
    }

    static void myMethod(String fName, String lName){
        System.out.println(fName + " " + lName);
    }

    static void myMethod(String fName, String mName, String lName){
        System.out.println(fName + " " + mName + " " + lName);
    }

}