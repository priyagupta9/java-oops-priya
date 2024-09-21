public class TestBookAdvanced {
    public static void main(String[] args) {
        AuthorAdvanced[] authors = new AuthorAdvanced[2];
        authors[0] = new AuthorAdvanced("Tan Ah Teck", "AhTeck@somewhere.com", 'm');
        authors[1] = new AuthorAdvanced("Paul Tan", "Paul@nowhere.com", 'm');

        // Declare and allocate a Book instance
        BookAdvanced javaDummy = new BookAdvanced("Java for Dummy", authors, 19.99, 99);
        System.out.println(javaDummy);  // toString()
        System.out.println("Author Names: "+javaDummy.getAuthorNames());
        System.out.println("Authors: "+javaDummy.getAuthors());
    }
}
