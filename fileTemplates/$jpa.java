#if ($PACKAGE_NAME && $PACKAGE_NAME != "")package $PACKAGE_NAME;#end

import org.springframework.data.repository.JpaRepository;

public interface $NAME extends JpaRepository<$Entity_class, Long> {
    
}