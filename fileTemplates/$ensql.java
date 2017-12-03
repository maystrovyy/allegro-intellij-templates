#if ($PACKAGE_NAME && $PACKAGE_NAME != "")package $PACKAGE_NAME;#end
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;

import javax.persistence.*;

import static com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "$TABLE_NAME")
@JsonInclude(value = NON_NULL)
@EqualsAndHashCode(of = {""})
@Builder(builderMethodName = "of")
@JsonIgnoreProperties(ignoreUnknown = true)
public class $NAME {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", updatable = false)
    private Long id;
    
}