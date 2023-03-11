/**
 * 
 */
package com.nereidarondon;


/**
 * @author Nery
 * Useful for scanning packages other than where the springboot @ componentscan 
 * annotation is in
 * 
 * using this interface class instead of 
 * @ SpringBootApplication(scanBasePackages = {com.nereidarondon} )
 * These 2 are the same but using the one below helps avoid misspell errors
 * @ SpringBootApplication(scanBasePackageClasses = {ComponentScanMarker.class} )
 */
public interface ComponentScanMarker {

}
