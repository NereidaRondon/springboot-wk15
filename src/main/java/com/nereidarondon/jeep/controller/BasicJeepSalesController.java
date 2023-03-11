package com.nereidarondon.jeep.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import com.nereidarondon.jeep.entity.Jeep;
import com.nereidarondon.jeep.service.JeepSalesService;
import lombok.extern.slf4j.Slf4j;

/**
 * This is connected to the interface
 *Have to tell SpringBoot that this controller is a rest controller that implements JeepSalesController
 * RestController annotation does both @Controller and @ResponseBody annotations together
 * 
 * Slf4j adds a lombok logger
 */
@RestController
@Slf4j
public class BasicJeepSalesController implements JeepSalesController {
  
  @Autowired
  private JeepSalesService jeepSalesService;
  
  @Override
  public List<Jeep> fetchJeeps(String model, String trim) {
    //log.info("model={}, trim={}", model, trim);
    log.debug("model={}, trim={}", model, trim);
    return jeepSalesService.fetchJeeps(model, trim);
  }

}
