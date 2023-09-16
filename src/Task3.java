public class Task3 {
    public static boolean checkIfStringIsEmail(final String email) {
        if (email == null || email.isEmpty()) {
            return false;
        }
        int atIndex = email.indexOf('@');
        int dotIndex = email.lastIndexOf('.');
        if (atIndex <= 0 || atIndex >= email.length() - 1) {
            return false;
        }
        if (dotIndex <= atIndex) {
            return false;
        }
        if (dotIndex >= email.length() - 1) {
            return false;
        }
        for (int i = 0; i < email.length() - 1; i++) {
            if (email.charAt(i) == '.' && email.charAt(i + 1) == '.') {
                return false;
            }
        }
        return true;
    }
}


