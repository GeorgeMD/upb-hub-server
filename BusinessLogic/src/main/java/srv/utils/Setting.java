package srv.utils;

/**
 * @author GeorgeMD
 */
public enum Setting {
    FIRST_WEEK("FirstWeek"),
    CLIENT_VERSION("ClientVersion");

    private final String name;

    Setting(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
