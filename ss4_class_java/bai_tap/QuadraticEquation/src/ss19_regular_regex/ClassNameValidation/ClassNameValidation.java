package ss19_regular_regex.ClassNameValidation;

public class ClassNameValidation {
    public static boolean validate(String className) {
        String regex = "^[CAP][0-9]{4}[GHIK]$";
        return className != null && className.matches(regex);
    }
}
