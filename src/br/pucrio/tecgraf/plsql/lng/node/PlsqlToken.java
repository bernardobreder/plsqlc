package br.pucrio.tecgraf.plsql.lng.node;

import java.io.IOException;

public class PlsqlToken {

	/** Palavra */
	private String word;
	/** Inicio de Linha */
	private int beginLine;
	/** Fim de Linha */
	private int endLine;
	/** Inicio de Coluna */
	private int beginColumn;
	/** Fim de Coluna */
	private int endColumn;

	public PlsqlToken(String word, int beginLine, int endLine, int beginColumn,
			int endColumn) {
		super();
		this.word = word;
		this.beginLine = beginLine;
		this.endLine = endLine;
		this.beginColumn = beginColumn;
		this.endColumn = endColumn;
	}

	public String getWord() {
		return word;
	}

	public int getBeginLine() {
		return beginLine;
	}

	public int getEndLine() {
		return endLine;
	}

	public int getBeginColumn() {
		return beginColumn;
	}

	public int getEndColumn() {
		return endColumn;
	}

	private void readObject(java.io.ObjectInputStream stream)
			throws IOException, ClassNotFoundException {
		this.word = stream.readUTF();
		this.beginLine = stream.readInt();
		this.endLine = stream.readInt();
		this.beginColumn = stream.readInt();
		this.endColumn = stream.readInt();
	}

	private void writeObject(java.io.ObjectOutputStream stream)
			throws IOException {
		stream.writeUTF(word);
		stream.writeInt(beginLine);
		stream.writeInt(endLine);
		stream.writeInt(beginColumn);
		stream.writeInt(endColumn);
	}

	public Object clone() {
		return new PlsqlToken(word, beginLine, endLine, beginColumn, endColumn);
	}

	public int hashCode() {
		return word.hashCode() * 3 + beginLine * 5 + endLine * 7 + beginColumn
				* 11 + endColumn * 13;
	}

	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PlsqlToken other = (PlsqlToken) obj;
		if (beginLine != other.beginLine)
			return false;
		if (beginColumn != other.beginColumn)
			return false;
		if (endColumn != other.endColumn)
			return false;
		if (endLine != other.endLine)
			return false;
		if (!word.equals(other.word))
			return false;
		return true;
	}

	public boolean equals(PlsqlToken other) {
		if (beginLine != other.beginLine)
			return false;
		if (beginColumn != other.beginColumn)
			return false;
		if (endColumn != other.endColumn)
			return false;
		if (endLine != other.endLine)
			return false;
		if (!word.equals(other.word))
			return false;
		return true;
	}

	public String toString() {
		return this.word;
	}

}
