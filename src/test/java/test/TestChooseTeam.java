package test;

import org.example.Main;
import org.junit.Assert;
import org.junit.Test;

public class TestChooseTeam {
    @Test
    public void test1() {
        int[] mass = {2, 3, 3, 5};
        Assert.assertEquals(13, Main.chooseTeamForBest(mass, 3));
    }

    @Test
    public void test2() {
        int[] mass = {2, 3, 3, 5};
        Assert.assertEquals(8, Main.chooseTeamForBest(mass, 2));
    }

    @Test
    public void test3() {
        int[] mass = {1, 3, 3, 3, 3, 3, 5};
        Assert.assertEquals(20, Main.chooseTeamForBest(mass, 6));
        Assert.assertEquals(16, Main.chooseTeamForBest(mass, 5));
    }

    @Test
    public void test13() {
        int[] mass = {1, 1, 4, 4, 4, 4, 9, 10};
        Assert.assertEquals(19, Main.chooseTeamForBest(mass, 7));
        Assert.assertEquals(13, Main.chooseTeamForBest(mass, 6));
        Assert.assertEquals(17, Main.chooseTeamForBest(mass, 5));
    }

    @Test
    public void test12() {
        int[] mass = {1, 1, 4, 4, 4, 4, 9};
        Assert.assertEquals(13, Main.chooseTeamForBest(mass, 6));
        Assert.assertEquals(17, Main.chooseTeamForBest(mass, 5));
        Assert.assertEquals(13, Main.chooseTeamForBest(mass, 4));
    }

    @Test
    public void test14() {
        int[] mass = {1, 1, 4, 4, 4, 4, 4, 9, 10};
        Assert.assertEquals(21, Main.chooseTeamForBest(mass, 6));
        Assert.assertEquals(17, Main.chooseTeamForBest(mass, 5));
        Assert.assertEquals(13, Main.chooseTeamForBest(mass, 4));
    }

    @Test
    public void test1a() {
        int[] mass = {1, 3, 3, 5};
        Assert.assertEquals(11, Main.chooseTeamForBest(mass, 3));
        Assert.assertEquals(7, Main.chooseTeamForBest(mass, 2));
        Assert.assertEquals(4, Main.chooseTeamForBest(mass, 1));
    }
    @Test
    public void test8() {
        int[] mass = {2,2,3,3,6};
        Assert.assertEquals(12, Main.chooseTeamForBest(mass, 4));
        Assert.assertEquals(10, Main.chooseTeamForBest(mass, 3));
        Assert.assertEquals(7, Main.chooseTeamForBest(mass, 2));
    }

}


