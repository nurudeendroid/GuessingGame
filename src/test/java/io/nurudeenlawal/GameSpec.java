package io.nurudeenlawal;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by nurudeenlawal on 4/29/16.
 */
public class GameSpec {

 @Test
 public void isItLowerTest(){
  Game game = new Game();
  game.guess = 6;
  boolean actualValue = game.isItLower();
  Assert.assertTrue("Should return true", actualValue);
 }
 @Test
 public void checkEquality(){
  Game game = new Game();
  game.guess = 8;
  boolean actualValue = game.isItEqual();
  Assert.assertTrue("Should return true", actualValue);
 }
 @Test
 public void  isItHigherTest(){
  Game game = new Game();
  game.guess = 9;
  boolean actualValue = game.isItHigher();
  Assert.assertTrue("Should return true", actualValue);
 }

}
