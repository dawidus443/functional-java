package functionalinterface;

import java.util.List;
import java.util.function.Supplier;

public class _Supplier {
    public static void main(String[] args) {
        System.out.println(getDBConnectionURL());
        System.out.println(getDBCConnectionURLSupplier.get());
        System.out.println(getDBCConnectionURLsSupplier.get());
        System.out.println(getDBCConnectionURLsSupplier.get().get(0));
        System.out.println(getDBCConnectionURLsSupplier.get().get(1));
    }

    static String getDBConnectionURL(){
        return "jdbc://localhost:5432/users";
    }

    static Supplier<String> getDBCConnectionURLSupplier = ()
            -> "jdbc://localhost:5432/users";
    static Supplier<List<String>> getDBCConnectionURLsSupplier = ()
            -> List.of("jdbc://localhost:5432/users",
            "jdbc://localhost:5432/customers");
}
