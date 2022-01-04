package org.itstep.step02;

import org.itstep.step01.ObjectPair;

// TODO: Пишите ваш код здесь
public class PairDriver {
    Pair[] stadiums = new Pair[3];


    public static String largestStadium(Pair[] stadiums) {
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
