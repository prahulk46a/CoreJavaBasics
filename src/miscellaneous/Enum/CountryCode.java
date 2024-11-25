package miscellaneous.Enum;
//Lookup Table=> - Avoids the need for external maps or additional data structures.
//               - Provides a clean and type-safe way to perform lookups.
public enum CountryCode {
    USA("+1"),India("+91"),Uk("+44"),PAK("+92");

    private final String code;
    CountryCode(String code) {
        this.code = code;
    }
    public String getCode() {
        return code;
    }
}
