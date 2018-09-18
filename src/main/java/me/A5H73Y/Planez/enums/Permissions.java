package me.A5H73Y.Planez.enums;

public enum Permissions {

    ALL("Planez.*"),
    ADMIN("Planez.Admin"),

    PURCHASE("Planez.Purchase"),
    UPGRADE("Planez.Upgrade"),
    PLACE("Planez.Place"),

    CREATE_SIGN("Planez.CreateSign");

    private final String permission;

    Permissions(String permission) {
        this.permission = permission;
    }

    public String getPermission() {
        return permission;
    }
}
