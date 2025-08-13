package com.joaovictor.bookvault.bookvault.model;

public enum Language {
    ES("es"),
    EN("en"),
    FR("fr"),
    PT("pt"),
    DE("de");

    private String language;

    Language(String language) {
        this.language = language;
    }

    public String getLanguage() {
        return language;
    }

    public static Language fromString(String text) {
        for (Language language : Language.values()) {
            if (language.language.equalsIgnoreCase(text)) {
                return language;
            }
        }
        throw new IllegalArgumentException("Nada encontrado: " + text);
    }
}
