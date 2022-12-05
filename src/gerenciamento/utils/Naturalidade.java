package gerenciamento.utils;

public enum Naturalidade {
	MANHA("manhã"), TARDE("tarde"), NOITE("noite");

	private String descricao;

	Naturalidade(String descricao) {
		this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	}
}
