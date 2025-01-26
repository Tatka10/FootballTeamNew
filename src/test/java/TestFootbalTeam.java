import org.example.Main;
import org.junit.Assert;
import org.junit.Test;

public class TestFootbalTeam {
    @Test
    public void test1(){
        int [] effect= {1,3,3,5};
        //{*,3,3,5}
        int expected=11;
        Assert.assertEquals(expected, Main.countSummEffectivity(effect));
    }
    @Test
    public void test2(){
        int [] effect= {20,20,20,20,100};
        //{*,*,*,20,100}
        int expected=120;
        Assert.assertEquals(expected, Main.countSummEffectivity(effect));
    }
    @Test
    public void test3(){
        int [] effect= {1,3,3,3,3,3,5};
        //{*,3,3,3,3,3,5}
        int expected=20;
        Assert.assertEquals(expected, Main.countSummEffectivity(effect));
    }
    @Test
    public void test4(){
        int [] effect= {1,3,3,3,3,3,7};
        //{1,3,3,3,3,3,*}
        int expected=16;
        Assert.assertEquals(expected, Main.countSummEffectivity(effect));
    }
    @Test
    public void test5(){
        int [] effect= {1,1,3,3,3,5};
        //{*,*,3,3,3,5}
        int expected=14;
        Assert.assertEquals(expected, Main.countSummEffectivity(effect));
    }
    @Test
    public void test6(){
        int [] effect= {2,3,3,5};
        //{2,3,3,5}
        int expected=13;
        Assert.assertEquals(expected, Main.countSummEffectivity(effect));
    }
    @Test
    public void test6f(){ // ошибка в вычислении
        int [] effect= {2,2,3,3,5};
        //{*,2,3,3,5}
        int expected=13;
        Assert.assertEquals(expected, Main.countSummEffectivity(effect));
    }
    @Test
    public void test7(){
        int [] effect= {2,3,3,6};
        //{*,3,3,6}
        int expected=12;
        Assert.assertEquals(expected, Main.countSummEffectivity(effect));
    }
    @Test
    public void test8(){
        int [] effect= {2,2,3,3,6};
        //{*,*,3,3,6}
        int expected=12;
        Assert.assertEquals(expected, Main.countSummEffectivity(effect));
    }
    @Test
    public void test9(){
        int [] effect= {2,2,2,3,3,6};
        //{*,*,*,3,3,6}
        int expected=12;
        Assert.assertEquals(expected, Main.countSummEffectivity(effect));
    }
    @Test
    public void test10(){
        int [] effect= {2,2,2,2,3,3,6};
        //{2,2,2,2,3,3,*}
        int expected=14;
        Assert.assertEquals(expected, Main.countSummEffectivity(effect));
    }
    @Test
    public void test11(){
        int [] effect= {1,2,2,2,3,3,6};
        //{1,2,2,2,3,3,*}
        int expected=13;
        Assert.assertEquals(expected, Main.countSummEffectivity(effect));
    }
    @Test
    public void test12(){
        int [] effect= {1,1,4,4,4,4,9};
        //{*,1,4,4,4,4,*}
        int expected=17;
        Assert.assertEquals(expected, Main.countSummEffectivity(effect));
    }
    @Test
    public void test13(){
        int [] effect= {1,1,4,4,4,4,9,10};
        // {*,*,*,*,*,*,9,10}
        int expected=19;
        Assert.assertEquals(expected, Main.countSummEffectivity(effect));
    }
    @Test
    public void test14(){
        int [] effect= {1,1,4,4,4,4,4,9,10};
        //{*,* 1,4,4,4,4,4,*,*} - мы убрали 1 - а нужно оставить - итог 21
        int expected=21;
        Assert.assertEquals(expected, Main.countSummEffectivity(effect));
    }
    @Test
    public void test15(){
        int [] effect= {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,4,4,4,4,4,9,10};
        //{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,*,*,*,*,*,*,*}
        int expected=21;
        Assert.assertEquals(expected, Main.countSummEffectivity(effect));
    }
    @Test
    public void test16(){
        int [] effect= {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,4,4,4,4,4,9,10,20};
        //{*,*,*,*,*,*,*,*,*,*,*,*,*,*,*,*,*,*,*,*,*,*,*,*,*,*,*,10,20}
        int expected=30;
        Assert.assertEquals(expected, Main.countSummEffectivity(effect));
    }
    @Test
    public void test17(){
        int [] effect=
                {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,2,2,2,2,2,4,4,4,4,4,9,10,20};
        //{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,2,2,2,2,2,*,*,*,*,*,*, *, *}
        int expected=31;
        Assert.assertEquals(expected, Main.countSummEffectivity(effect));
    }

}
