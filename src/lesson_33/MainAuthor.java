package lesson_33;

import java.util.Arrays;

public class MainAuthor {
     /*
    Comparator Компаратор интерфейс

    Предоставляет классам возможности дополнительной сортировки по другим критериям, отличным от сортировки в естественном
    порядке.
    Находится в пакете java.util  и имеет метод compare()
     public int compare( T o1, T o2)

     Принимает два обьекта  и сравнивает их по тому же принципу, что и compareTo

     */
     public static void main(String[] args) {
         Author author1 = new Author ("Dauthor", "Rbook", 2000);
         Author author2 = new Author ("Nauthor", "Bbook", 1840);
         Author author3 = new Author ("Fauthor", "Ubook", 2021);
         Author author4 = new Author ("Gauthor", "Sbook", 1972);
         Author author5 = new Author ("Aauthor", "Tbook", 1961);

         Author[] authors = {author1,author2,author3,author4,author5};

         System.out.println("Before sort");
         for(Author author : authors)
             System.out.println(author);

         System.out.println();

         System.out.println("Sort by author's name:");
         Arrays.sort(authors);
         for(Author author : authors)
             System.out.println(author);

         System.out.println();
         System.out.println("Sort by publishing date:");
         Arrays.sort(authors, new PublishingYearComparator());
         for(Author author : authors)
             System.out.println(author);

         System.out.println();
         System.out.println("Sort by book's name:");
         Arrays.sort(authors, new BookNameComparator());
         for(Author author : authors)
             System.out.println(author);

     }
     }

