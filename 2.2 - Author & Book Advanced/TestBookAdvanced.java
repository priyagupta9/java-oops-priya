public class TestBookAdvanced {
    public static void main(String[] args) {
        AuthorAdvanced[] authors = new AuthorAdvanced[2];
        authors[0] = new AuthorAdvanced("Tan Ah Teck", "AhTeck@somewhere.com", 'm');
        authors[1] = new AuthorAdvanced("Paul Tan", "Paul@nowhere.com", 'm');

        // Declare and allocate a Book instance
        BookAdvanced javaDummy = new BookAdvanced("Java for Dummy", authors, 19.99, 99);
        System.out.println(javaDummy);  // toString()
        System.out.println("Author Names: "+javaDummy.getAuthorNames());


        AuthorAdvanced auth[] = javaDummy.getAuthors();

        String  authNames[] = new String[auth.length];
        String authEmail[] =  new String[auth.length];
        char authGender[] = new char[auth.length];

        for (int i = 0; i < auth.length; i++) {
           authNames[i] = auth[i].getName();
           authEmail[i] = auth[i].getEmail();
           authGender[i] = auth[i].getGender();
        }

        String authorsInfo = "";
        for (int i = 0; i < auth.length; i++) {
            authorsInfo = authorsInfo + "[name="+authNames[i]+", email="+authEmail[i]+", gender="+authGender[i]+"]";
            
            if(i < auth.length - 1){
                authorsInfo+=",";
            }
        }

        System.out.println("Authors: "+ authorsInfo);
    }
}
