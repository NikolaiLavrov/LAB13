package net;

public enum ErrorCode {
    NEGATIVE_SIZE("Size can't be negative");

    private String text;

    ErrorCode(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
