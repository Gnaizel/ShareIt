package org.example.enums;

public enum ItemStatus {
    TRUE,
    FALSE;

    public static ItemStatus fromBoolean(boolean value) {
        return value ? TRUE : FALSE;
    }
}
