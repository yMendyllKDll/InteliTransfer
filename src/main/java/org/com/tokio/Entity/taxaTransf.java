package org.com.tokio.Entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class taxaTransf {

    @Id
    private Long id;

    private Integer diasDe;

    private Integer diasAte;

    private Double valor;

    private Double taxa;
}
