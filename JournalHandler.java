public class JournalHandler implements BookHandler{
    @Override
    public String handle(String type, String title) {
        if(type.equals("journal")){
            return " is borrowing a Journal: " + title;
        }
        else{
            return ": The Journal you're trying to borrow is not registered in the journal category.\n Please use a different handler";
        }
    }
}