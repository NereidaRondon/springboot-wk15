/**
 * 
 */
package com.nereidarondon.jeep.dao;

import java.util.List;
import com.nereidarondon.jeep.entity.Jeep;
import com.nereidarondon.jeep.entity.JeepModel;

/**
 * @author Nery
 *
 */
public interface JeepSalesDao {

  /**
   * @param model
   * @param trim
   * @return
   */
  List<Jeep> fetchJeeps(JeepModel model, String trim);

}
