package com.epam.lab27.tasks;

import java.math.BigDecimal;


public class RiseCountService {

    public void calculateRise() {
        BigDecimal riseCount = new BigDecimal(0);
        for (int i = 0; i <= 63; i++) {
            riseCount = riseCount.add(BigDecimal.valueOf(Math.pow(2, i)));
        }
        System.out.println(riseCount);

    }
}
