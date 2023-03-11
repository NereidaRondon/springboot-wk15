/**This was created from FetchJeepTest, this is the parent class to it
 * This is the child class of BaseTest
 */
package com.nereidarondon.jeep.controller.support;

import java.math.BigDecimal;
import java.util.LinkedList;
import java.util.List;
import com.nereidarondon.jeep.entity.Jeep;
import com.nereidarondon.jeep.entity.JeepModel;

public class FetchJeepTestSupport extends BaseTest{
  //this method was created by "List<Jeep> expected = buildExpected();" in FetchJeepTest class
  protected List<Jeep> buildExpected() {
    List<Jeep> list = new LinkedList<>();
    // @formatter:off
    list.add(Jeep.builder()
        .modelId(JeepModel.WRANGLER)
        .trimLevel("Sport")
        .numDoors(2)
        .wheelSize(17)
        .basePrice(new BigDecimal ("28475.00"))
        .build());
    
    list.add(Jeep.builder()
        .modelId(JeepModel.WRANGLER)
        .trimLevel("Sport")
        .numDoors(4)
        .wheelSize(17)
        .basePrice(new BigDecimal ("31975.00"))
        .build());
    
    // @formatter:on    
    return list;
  }
}


//INSERT INTO models (model_id, trim_level, num_doors, wheel_size, base_price) 
//VALUES('WRANGLER', 'Sport', 2, 17, 28475.00);

//INSERT INTO models (model_id, trim_level, num_doors, wheel_size, base_price) 
//VALUES('WRANGLER', 'Sport', 4, 17, 31975.00);