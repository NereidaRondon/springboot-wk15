/*Create jeepSales → fetchJeppTest → fetchJeepTestSupport →BaseTest
 * 
*/

package com.nereidarondon.jeep;


//imports for SpringBoot
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.nereidarondon.ComponentScanMarker;

//calls on SpringBoot, it's a combo of @ SpringBootConfiguration and @ EnableAutoConfiguration
@SpringBootApplication(scanBasePackageClasses = { ComponentScanMarker.class })
public class JeepSales {

  public static void main(String[] args) {
    //start SpringBoot from within application
    SpringApplication.run(JeepSales.class, args);

  }

}
