public class AudioBookHandler implements BookHandler{
    @Override
    public String handle(String type, String title) {
        if(type.equals("audio-book")){
            return " is borrowing an Audio-Book: " + title;
        }
        else{
            return ": The Book you're trying to borrow is not registered in the audio-book category.\n Please use a different handler";
        }
    }
}