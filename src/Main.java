public class Main {
    public static void main(String[] args) {
        Author ivanTurgenev = new Author("Иван", "Тургенев");
        Author jackLondon = new Author("Джек", "Лондон");
        Book mumu = new Book ("Муму", ivanTurgenev, 1995);
        Book beliyKlik = new Book ("Белый клык", jackLondon, 1987);
        System.out.println(mumu.bookInfo());
        System.out.println(beliyKlik.bookInfo());
        mumu.setPublishYear(2010);
        System.out.println(mumu.bookInfo());


        System.out.println();
        System.out.println(mumu.toString());
        System.out.println(beliyKlik);
        System.out.println(beliyKlik.hashCode() == mumu.hashCode());
        System.out.println(mumu.equals(beliyKlik));
    }
}