package aula4;

public class Mensagem {
	String destinatario = "";
	String assunto = "";
	String corpoDaMensagem = "";
	
	public String getDestinatario() {
		return destinatario;
	}
	
	public void setDestinatario(String destinatario) {
		this.destinatario = destinatario;
	}
	
	public String getAssunto() {
		return assunto;
	}
	
	public void setAssunto(String assunto) {
		this.assunto = assunto;
	}
	
	public String getCorpoDaMensagem() {
		return corpoDaMensagem;
	}
	
	public void setCorpoDaMensagem(String corpoDaMensagem) {
		this.corpoDaMensagem = corpoDaMensagem;
	}
}
