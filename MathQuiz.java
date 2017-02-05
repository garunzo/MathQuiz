
  import java.util.*;

  public class MathQuiz {

    static int mistake = 0;

    public static void main(String[] args) {

      String question[] = {"What is i^4?", "√6 * √5 * √4 * √3 * √2 * √1 = k√5.  What is k?"
                          ,"97.5% of 360", "90% of the runners who started a marathon completed it.\n20% of those who completed it are women. 180 women completed the marathon. \nHow many runners started the marathon?"
                          ,"When p = 3 and a = 5, by how much does the value of 3p^2 – 2a exceed the value of 2p^2 – 3a ?"};
      int realAnswer[] = {1, 12, 351, 1000, 14};
      for (int i=0; i<5; i++)
        askQuestion(question[i], realAnswer[i]);

      MathQuiz.mistake = 5 - MathQuiz.mistake;
      System.out.println("\nYou scored " + MathQuiz.mistake + "/5");

      if (MathQuiz.mistake != 5) {
        // for (int i=0; i<5; i++)
        //   askQuestion(question[i], realAnswer[i]);
      }
      else {
        System.out.println("\nWell done!");
      }
      MathQuiz.mistake = 0;
    }

    private static void askQuestion(String question, int realAnswer) {
      int answer = 1;
      String input;
      boolean error = false;
      System.out.println("\n" + question);
      input = System.console().readLine();
      answer = Integer.parseInt(input);
      if (answer != realAnswer) {
        MathQuiz.mistake = MathQuiz.mistake + 1;
        error = true;
      }
      else {
        MathQuiz.mistake = MathQuiz.mistake + 0;
        error = false;
      }
      error = false;
    }

  }
