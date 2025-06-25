package ss19_regular_regex.PhoneNumberValidation;

public class PhoneNumberValidation {
    public static boolean validate(String phoneNumber) {
        String regex = "^\\([0-9]{2}\\)-\\(0[0-9]{9}\\)$";
        return phoneNumber != null && phoneNumber.matches(regex);
    }
}
