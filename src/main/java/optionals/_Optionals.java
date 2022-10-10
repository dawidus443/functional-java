package optionals;

import java.util.Optional;

public class _Optionals {
    public static void main(String[] args) {

        Optional.ofNullable("dawid@gmail.com")
                .ifPresentOrElse(
                        email -> System.out.println("Sending email to " + email),
                        () -> System.out.println("Cannot send email"));
    }
}
