#if ($PACKAGE_NAME && $PACKAGE_NAME != "")package $PACKAGE_NAME;#end

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface $NAME extends JpaRepository<$Entity_class, Long> {
    
}