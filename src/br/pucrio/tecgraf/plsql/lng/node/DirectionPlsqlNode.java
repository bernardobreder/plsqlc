package br.pucrio.tecgraf.plsql.lng.node;

public class DirectionPlsqlNode extends PlsqlNode {

	private PlsqlToken in;

	private PlsqlToken out;

	public DirectionPlsqlNode(PlsqlToken in, PlsqlToken out) {
		super();
		this.in = in;
		this.out = out;
	}

	public PlsqlToken getIn() {
		return in;
	}

	public void setIn(PlsqlToken in) {
		this.in = in;
	}

	public PlsqlToken getOut() {
		return out;
	}

	public void setOut(PlsqlToken out) {
		this.out = out;
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		if (in != null) {
			sb.append(in.getWord());
			if (out != null) {
				sb.append(' ');
			}
		}
		if (out != null) {
			sb.append(out.getWord());
		}
		return sb.toString();
	}
	
}
