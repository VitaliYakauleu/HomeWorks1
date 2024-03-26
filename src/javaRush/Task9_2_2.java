package javaRush;

import java.util.Random;

/*Magic 8 ball
        В этой задаче тебе предстоит реализовать метод getPrediction() в классе MagicBall, 
        который будет работать как шар предсказаний. Он случайным образом возвращает фразу-ответ на заданный вопрос. 
        В методе getPrediction() нужно использовать метод nextInt(int) класса Random, который должен возвращать знач*/
public class Task9_2_2 {
    public static void main(String[] args) {

        System.out.println(MagicBall.getPrediction());
    }
    public class MagicBall{
        public static final String YES = "да";
        public static final String NO = "нет";
        public static final String MAYBE = "возможно";
        
        public static String getPrediction(){
            int a =new Random().nextInt(0,3);
            if (a==0){
                return YES;
            } else if (a==1) {
                return NO;
                
            } else if (a==2) {
                return MAYBE;
                
            }else {
                return null;
            }

        }
    }
}
