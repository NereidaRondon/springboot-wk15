/**
 * 
 */
package com.nereidarondon.jeep.entity;

import java.math.BigDecimal;
import java.util.Comparator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Nery
 *
 */
/* these are lombok annotations
@ Getter 
@ Setter
@ EqualsAndHashCode
@ ToString
@ NoArgsConstructor
*/
// can get the same result as above with just one annotation, see below:
@Data
// @ builder requires allargsconst, but we want a noargsconst, 
// that breaks builder so we need an allargs const again to fix it
@Builder 
@NoArgsConstructor
@AllArgsConstructor
//Comparable will take car of the sorting test issues with the expected and actual
public class Jeep implements Comparable<Jeep>{
  private Long modelPK;
  private JeepModel modelId;
  private String trimLevel;
  private int numDoors;
  private int wheelSize;
  private BigDecimal basePrice;
  
  //When Jackson is converting this object to JSON 
  //it will ignore/leave out the model_pk 
  //override lombok getter
  @JsonIgnore
  public Long getModelPK(){
    return modelPK;
  }

  @Override
  public int compareTo(Jeep that) {
    //@formatter:off
    return Comparator
        .comparing(Jeep::getModelId)
        .thenComparing(Jeep::getTrimLevel)
        .thenComparing(Jeep::getNumDoors)
        .compare(this,  that);
    //@formatter:on
  }
}

/*CREATE TABLE models (
    model_pk int unsigned NOT NULL AUTO_INCREMENT,
    model_id enum('GRAND_CHEROKEE', 'CHEROKEE', 'COMPASS', 'RENEGADE', 'WRANGLER', 'GLADIATOR', 'WRANGLER_4XE') NOT NULL,
    trim_level varchar(40) NOT NULL,
    num_doors int NOT NULL,
    wheel_size int NOT NULL,
    base_price decimal(9, 2) NOT NULL,
    PRIMARY KEY (model_pk),
    UNIQUE KEY (model_id, trim_level, num_doors)
  );
*/