package org.javacs.lsp;

public class Range {
    public Position start, end;

    public Range() {}

    public Range(Position start, Position end) {
        this.start = start;
        this.end = end;
    }
    
    public static final Range create(Position start, Position end) {
      return new Range(start, end);
    }

    public static final Range NONE = new Range(Position.NONE, Position.NONE);
}
