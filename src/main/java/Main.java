

/**
 *  Дан массив пар названий книг и авторов, необходимо привести каждую
 *  пару в строку вида: “Название книги” Имя Отчество Фамилия автора
 */

public class Main {
    public static void main(String[] args) {
        String[][] booksAndAuthors = {
                {"Название книги 1", "Фамилия1 Имя1 Отчество1"},
                {"Название книги 2", "Фамилия2 Имя2 Отчество2"},
                {"Название книги 3", "Фамилия3 Имя3 Отчество3"},
        };
        for (String[] booksAndAuthor : booksAndAuthors) {
            String bookTitle = booksAndAuthor[0];
            String[] autorNameParts = booksAndAuthor[1].split(" ");
            String authorFullName = String.join(" ", autorNameParts[1],
                                                             autorNameParts[2],
                                                             autorNameParts[0]);
            String result = String.format("\"%s\"%s", bookTitle, authorFullName);
            System.out.println(result);

        }
    }
}