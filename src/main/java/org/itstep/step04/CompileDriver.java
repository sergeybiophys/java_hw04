package org.itstep.step04;

import org.itstep.step02.Pair;

/**
 * Обобщения. Вопросы о компиляции
 *
 * @author Nathan Sprague
 * @version V1, 8/2016
 */
public class CompileDriver {

    public static void main(String[] args) {

        // TODO: перед удалением комментариев отметьте каждую строчку, где есть присвоение - сокмпилируется ли код или нет
        Pair<String, Integer> p1;
        Pair<String, Number> p2;
        Pair<Object, Object> p3;
        Pair<?, ?> p4;
        Pair<?, ? extends Number> p5;

        p1 = new Pair<String, Integer>("A", 7); //Yes
        int a = p1.getSecond(); //Yes

        //p1 = new Pair<Integer, Double>(23, 12.0); //No

        //p2 = new Pair<String, Integer>("B", 8); //No

        //p3 = new Pair<String, Integer>("C", 9); //No

        p4 = new Pair<String, String>("House", "Car"); //Yes
        p4 = new Pair<String, Integer>("D", 10); //Yes

        //Integer b = p4.getSecond();
        Integer c = (Integer) p4.getSecond(); //Yes

        //p5 = new Pair<String, String>("E", "G"); //No
        p5 = new Pair<String, Double>("E", 11.0); //Yes
        p5 = new Pair<String, Integer>("E", 11); //Yes

        //Integer d = p5.getSecond(); //No
        Integer e = (Integer) p5.getSecond(); //Yes
    }

}
