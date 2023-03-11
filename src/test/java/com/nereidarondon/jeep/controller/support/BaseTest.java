/*Hierarchy:(parent class)BaseTest → FetchJeepTestSupport → FetchJeepTest
 * fill out BaseTest then go to FetchJeepTest
 * 
 */
package com.nereidarondon.jeep.controller.support;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.test.web.server.LocalServerPort;
import lombok.Getter;

public class BaseTest {

  //Spring assigns a value to serverPort automatically
  @LocalServerPort
  private int serverPort;
  
  //injects whatever copy of Test rest template has been created for us
  @Autowired
  //Lombok creates getBaseUri() getter for me
  @Getter  
  private TestRestTemplate restTemplate;
  
  //retrieve URI
  protected String getBaseUri() {
    //will fill in %d as serverPort #
    return String.format("http://localhost:%d/jeeps", serverPort);
  }
  
  
}
