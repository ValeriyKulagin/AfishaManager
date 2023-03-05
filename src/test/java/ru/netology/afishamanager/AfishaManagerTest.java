package ru.netology.afishamanager;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AfishaManagerTest {
    String movie1 = "Бладшот";
    String movie2 = "Вперед";
    String movie3 = "Отель Белград";
    String movie4 = "Джентельмены";
    String movie5 = "Человек-невидимка";
    String movie6 = "Тролли. Мировой тур";
    String movie7 = "Номер один";
    String movie8 = "Один дома";
    String movie9 = "Начало";
    String movie10 = "Гладиатор";
    String movie11 = "Такси";
    String movie12 = "Молчание ягнят";
    String movie13 = "Вышка";
    String movie14 = "Бугимен";
    String movie15 = "Тутси";

    @Test
    public void shouldFindAll() {
        AfishaManager manager = new AfishaManager();
        manager.addMovie(movie1);
        manager.addMovie(movie2);
        manager.addMovie(movie3);
        manager.addMovie(movie4);
        manager.addMovie(movie5);
        manager.addMovie(movie6);
        manager.addMovie(movie7);
        manager.addMovie(movie8);
        manager.addMovie(movie9);
        manager.addMovie(movie10);
        String[] expected = {movie1, movie2, movie3, movie4, movie5, movie6, movie7, movie8, movie9, movie10};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindAllLimit() {
        AfishaManager manager = new AfishaManager(15);
        manager.addMovie(movie1);
        manager.addMovie(movie2);
        manager.addMovie(movie3);
        manager.addMovie(movie4);
        manager.addMovie(movie5);
        manager.addMovie(movie6);
        manager.addMovie(movie7);
        manager.addMovie(movie8);
        manager.addMovie(movie9);
        manager.addMovie(movie10);
        manager.addMovie(movie11);
        manager.addMovie(movie12);
        manager.addMovie(movie13);
        manager.addMovie(movie14);
        manager.addMovie(movie15);

        String[] expected = {movie1, movie2, movie3, movie4, movie5, movie6, movie7, movie8, movie9, movie10, movie11, movie12, movie13, movie14, movie15};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test

    public void shouldFindAllNull() {
        AfishaManager manager = new AfishaManager();

        String [] expected = {};
        String [] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindAllUnderTheLimit() {
        AfishaManager manager = new AfishaManager();
        manager.addMovie(movie1);
        manager.addMovie(movie2);
        manager.addMovie(movie3);
        manager.addMovie(movie4);
        manager.addMovie(movie5);

        String [] expected = {movie1, movie2, movie3, movie4, movie5};
        String [] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLast() {
        AfishaManager manager = new AfishaManager();
        manager.addMovie(movie1);
        manager.addMovie(movie2);
        manager.addMovie(movie3);
        manager.addMovie(movie4);
        manager.addMovie(movie5);
        manager.addMovie(movie6);
        manager.addMovie(movie7);
        manager.addMovie(movie8);
        manager.addMovie(movie9);
        manager.addMovie(movie10);

        String[] expected = {movie10, movie9, movie8, movie7, movie6, movie5, movie4, movie3, movie2, movie1};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void shouldFindLastWithLimit() {
        AfishaManager manager = new AfishaManager(15);
        manager.addMovie(movie1);
        manager.addMovie(movie2);
        manager.addMovie(movie3);
        manager.addMovie(movie4);
        manager.addMovie(movie5);
        manager.addMovie(movie6);
        manager.addMovie(movie7);
        manager.addMovie(movie8);
        manager.addMovie(movie9);
        manager.addMovie(movie10);
        manager.addMovie(movie11);
        manager.addMovie(movie12);
        manager.addMovie(movie13);
        manager.addMovie(movie14);
        manager.addMovie(movie15);

        String[] expected = {movie15, movie14, movie13, movie12, movie11, movie10, movie9, movie8, movie7, movie6, movie5, movie4, movie3, movie2, movie1};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);

    }

    @Test

    public void shouldFindLastOverTheLimit() {
        AfishaManager manager = new AfishaManager(7);
        manager.addMovie(movie1);
        manager.addMovie(movie2);
        manager.addMovie(movie3);
        manager.addMovie(movie4);
        manager.addMovie(movie5);
        manager.addMovie(movie6);
        manager.addMovie(movie7);
        manager.addMovie(movie8);
        manager.addMovie(movie9);
        manager.addMovie(movie10);

        String[] expected = {movie10, movie9, movie8, movie7, movie6, movie5, movie4};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);

    }

    @Test

    public void shouldFindLastUnderTheLimit() {
        AfishaManager manager = new AfishaManager(11);
        manager.addMovie(movie1);
        manager.addMovie(movie2);
        manager.addMovie(movie3);
        manager.addMovie(movie4);
        manager.addMovie(movie5);
        manager.addMovie(movie6);

        String [] expected = {movie6, movie5, movie4, movie3, movie2, movie1};
        String [] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test

    public void shouldFindLastNull() {
        AfishaManager manager = new AfishaManager();

        String [] expected = {};
        String [] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);

    }
}
