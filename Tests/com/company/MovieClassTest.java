package com.company;

import org.junit.Test;

import static org.junit.Assert.*;


public class MovieClassTest {

    //MovieClass getMovieNameTest.
    @Test()
    public void testGetMovieName() {
        MovieClass mn = new MovieClass();
        mn.setMovieName("Börü");
        assertEquals("Börü", mn.getMovieName());
    }

    //MovieClass getMovieTypeTest.
    @Test
    public void testGetMovieType() {
        MovieClass mt = new MovieClass();
        mt.setMovieType("horror");
        assertEquals("horror", mt.getMovieType());
    }

    //MovieClass getMovieDurationTest.
    @Test
    public void testGetMovieDuration() {
        MovieClass md = new MovieClass();
        md.setMovieDuration(213124125);
        assertEquals(213124125, md.getMovieDuration());
    }

    //MovieClass getMovieDirectorTest
    @Test
    public void testGetMovieDirector() {
        MovieClass movieDirector = new MovieClass();
        movieDirector.setMovieDirector("Kerem Can Özcan");
        assertEquals("Kerem Can Özcan", movieDirector.getMovieDirector());

    }

    //MovieClass getMovieIMDBTest
    @Test
    public void testGetMovieIMDB() {
        MovieClass movieIMDB = new MovieClass();
        movieIMDB.setMovieIMDB(4);
        assertEquals(4, movieIMDB.getMovieIMDB());
    }

    //MovieClass getMovieDescriptionTest
    @Test
    public void testGetMovieDescription() {
        MovieClass movieDescription = new MovieClass();
        movieDescription.setMovieDescription("MovieDescription1");
        assertEquals("MovieDescription1", movieDescription.getMovieDescription());
    }

    //MovieClass getMovieSeatsTest
    @Test
    public void testGetMovieSeats() {
        MovieClass movieSeats = new MovieClass();
        movieSeats.setMovieSeats(5);
        assertEquals(5, movieSeats.getMovieSeats());
    }
}