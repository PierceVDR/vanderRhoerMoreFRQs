public class Textbook extends Book {
    private int edition;

    public Textbook(String bookTitle, double bookPrice, int textbookEdition) {
        super(bookTitle,bookPrice);
        edition=textbookEdition;
    }

    public int getEdition(){return edition;}
    public boolean canSubstituteFor(Object other){

        if (!(other instanceof Textbook)){
            return false;
        }

        Textbook otherTextbook = (Textbook) other;

        return otherTextbook.getTitle().equals(getTitle()) && edition>=otherTextbook.getEdition();
    }

    @Override
    public String getBookInfo(){
        return super.getBookInfo()+"-"+edition;
    }
}
