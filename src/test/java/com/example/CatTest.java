package com.example;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class CatTest {

    Feline feline = new Feline();

    @Test
    public void getCatSoundTest(){
        Cat cat = new Cat(feline);
        String expected = "Мяу";
        String actual = cat.getSound();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getEatMeatTest() throws Exception{
        Cat cat = new Cat(feline);
        List<String>expectedEatMeat = List.of("Животные", "Птицы", "Рыба");
        List<String>actualEatMeat = cat.getFood();
        Assert.assertEquals(expectedEatMeat, actualEatMeat);
    }


}