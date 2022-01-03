package org.itstep.step01;

/**
 * Класс для тестирования кортежа ObjectPair
 *
 * @author Nathan Sprague
 * @version V1, 8/2016
 */
public class ObjectPairDriver {

    /**
     * Создайте несколько пар стадионов, затем распечатайте название стадиона с наибольшей вместимостью.
     *
     * @param args Не используется
     */
    public static void main(String[] args) {

        ObjectPair[] stadiums = new ObjectPair[3];
        stadiums[0] = new ObjectPair("Bridgeforth Stadium", 25000);
        stadiums[1] = new ObjectPair("Michigan Stadium", 109901);
        stadiums[2] = new ObjectPair("Lane Stadium", "66,233");

        System.out.println(stadiums[0]);

        System.out.println(largestStadium(stadiums));
    }

    /**
     * Возвращает название стадиона с наибольшей вместимостью.
     *
     * @param stadiums Массив ObjectPairs, где каждая пара содержит название стадиона, за которым следует целое число
     * @return Название стадиона с наибольшей вместимостью
     */
    public static String largestStadium(ObjectPair[] stadiums) {
        // TODO: реализуйте это метод в соответствии с комментариями
        int max = (int) stadiums[0].getSecond();
        String maxName = (String)stadiums[0].getFirst();
        for(int i = 0; i<stadiums.length; i++)
        {
            String tmpData = stadiums[i].getSecond().toString().replaceAll("[,]","");
            //TODO remove the comma
            Integer tmpInt = Integer.parseInt(tmpData);
            //float tmp = (float)item.getSecond();
            if(tmpInt>max)
            {
                max = tmpInt;
                maxName = (String)stadiums[i].getFirst();
            }
        }
        return maxName;
    }
}
