public class NEULibrary {
    public static void main(String[] args) {
        Student stud1 = new Student("Leoben Taningco", "22-10995-542");

        Book book1 = new Book("physical", "Crime & Punishment");
        Book book2 = new Book("audio-book", "No Longer Human");
        Book book3 = new Book("journal", "Notes from the Underground");

        BookProcessor processPB = new BookProcessor(new PhysicalBookHandler());
        BookProcessor processAB = new BookProcessor(new AudioBookHandler());
        BookProcessor processJB = new BookProcessor(new JournalHandler());

        System.out.println(stud1.getName() + processPB.borrow(book1));
        System.out.println(stud1.getName() + processAB.borrow(book2));
        System.out.println(stud1.getName() + processJB.borrow(book3));
        System.out.println(stud1.getName() + processJB.borrow(book2));
    }
}