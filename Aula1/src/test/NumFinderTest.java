package test;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;

import aula1.NumFinder;


class NumFinderTest {

	@Test
    void test1 () {
	    NumFinder numFinder = new NumFinder();
	    int[] vetor = {10, 1};
	    numFinder.find(vetor);
	    assertEquals(10, numFinder.getLargest());
	    assertEquals(1, numFinder.getSmallest());
    }
    
    
    @Test
    void test2 () {
	    NumFinder numFinder = new NumFinder();
	    int[] vetor2 = {1,50,10,5};
	    numFinder.find(vetor2);
	    assertEquals(50, numFinder.getLargest());
	    assertEquals(1, numFinder.getSmallest());
    }
    
    @Test
    void test3 () {
	    NumFinder numFinder = new NumFinder();
	    int[] vetor3 = {10,-1,5,50,-9,0};
	    numFinder.find(vetor3);
	    assertEquals(50, numFinder.getLargest());
	    assertEquals(1, numFinder.getSmallest());
    }

}
