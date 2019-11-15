package org.javacs.lsp;

public class TextEdit {
  public Range range;
  public String newText;

  public TextEdit() {}

  public TextEdit(Range range, String newText) {
    this.range = range;
    this.newText = newText;
  }

  public static final TextEdit create(Range range, String newText) {
    return new TextEdit(range, newText);
  }
}
