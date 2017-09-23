package br.pucrio.tecgraf.plsql.lng.node;

public class ObjectNamePlsqlNode extends PlsqlNode {

	private PlsqlToken prefix;

	private PlsqlToken name;

	public ObjectNamePlsqlNode(PlsqlToken prefix, PlsqlToken name) {
		super();
		this.prefix = prefix;
		this.name = name;
	}

	public PlsqlToken getPrefix() {
		return prefix;
	}

	public void setPrefix(PlsqlToken prefix) {
		this.prefix = prefix;
	}

	public PlsqlToken getName() {
		return name;
	}

	public void setName(PlsqlToken name) {
		this.name = name;
	}

	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + name.hashCode();
		result = prime * result + ((prefix == null) ? 0 : prefix.hashCode());
		return result;
	}

	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ObjectNamePlsqlNode other = (ObjectNamePlsqlNode) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (prefix == null) {
			if (other.prefix != null)
				return false;
		} else if (!prefix.equals(other.prefix))
			return false;
		return true;
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		if (prefix != null) {
			sb.append(prefix);
			sb.append('.');
		}
		sb.append(name);
		return sb.toString();
	}

}
