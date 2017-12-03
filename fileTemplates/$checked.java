#if ($PACKAGE_NAME && $PACKAGE_NAME != "")package $PACKAGE_NAME;#end

public class ${NAME} extends Exception {

    private final String message;
    public ${NAME}(String message) {
        super(message);
    }
}