package org.javacs.lsp;

public class Position {
    // 0-based
    public int line, character;

    public Position() {}

    public Position(int line, int character) {
        this.line = line;
        this.character = character;
    }

    public static final Position create(int line, int character) {
        return new Position(line, character);
    }

    public static final Position create(long line, long character) {
        return new Position(Math.toIntExact(line), Math.toIntExact(character));
    }

    public static final Position NONE = new Position(-1, -1);
}
