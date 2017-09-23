package br.pucrio.tecgraf.plsql.lng.node;

import java.util.List;

import br.pucrio.tecgraf.plsql.lng.grammer.Token;

public class PlsqlFactory {

  public PlsqlToken createToken(Token t) {
    if (t == null) {
      return null;
    }
    return this.createToken(t.image, t.beginLine, t.endLine, t.beginColumn,
      t.endColumn);
  }

  public PlsqlToken createToken(String word, int beginLine, int endLine,
    int beginColumn, int endColumn) {
    return new PlsqlToken(word, beginLine, endLine, beginColumn, endColumn);
  }

  public ObjectNamePlsqlNode createObjectName(PlsqlToken prefix, PlsqlToken name) {
    return new ObjectNamePlsqlNode(prefix, name);
  }

  public DirectionPlsqlNode createDirection(PlsqlToken in, PlsqlToken out) {
    return new DirectionPlsqlNode(in, out);
  }

  public PackagePlsqlNode createPackagePlsqlNode(PlsqlToken createToken,
    PlsqlToken replaceToken, PlsqlToken packageToken, ObjectNamePlsqlNode name,
    PlsqlToken asToken, List<PackageDeclarationPlsqlNode> declarations,
    PlsqlToken endToken) {
    return null;
  }

}
