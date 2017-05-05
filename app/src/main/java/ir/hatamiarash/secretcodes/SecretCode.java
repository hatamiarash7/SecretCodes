/*
 * Copyright (c) 2017 - All Rights Reserved - Arash Hatami
 */

package ir.hatamiarash.secretcodes;

import android.net.Uri;

class SecretCode {

    private final String code;
    private final String label;
    private final Uri icon;

    SecretCode(String code, Uri icon, String label) {
        this.code = code;
        this.icon = icon;
        this.label = label;
    }


    String getLabel() {
        return label;
    }

    Uri getIcon() {
        return icon;
    }

    String getCode() {
        return code;
    }

    @Override
    public String toString() {
        return "SecretCode{" +
                "code='" + code + '\'' +
                ", label='" + label + '\'' +
                '}';
    }
}