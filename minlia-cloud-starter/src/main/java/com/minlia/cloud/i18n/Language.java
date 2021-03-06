package com.minlia.cloud.i18n;

import com.minlia.cloud.holder.ContextHolder;

import java.util.Locale;

public class Language {

    public static String get(String key, Object[] arguments, Locale locale) {
        return ContextHolder.getContext().getMessage(key, arguments, locale);
    }

    public static String get(String key, Object[] arguments) {
        return ContextHolder.getContext().getMessage(key, arguments, Locale.ENGLISH);
    }

    public static String get(String key) {
        return ContextHolder.getContext().getMessage(key, new Object[]{}, Locale.ENGLISH);
    }
}
