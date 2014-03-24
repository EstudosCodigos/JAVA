package com.omm.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="despesas")
public class Despesas {

	
	@Id
	@Column(name="codDespesa")
	int id;
	
//	@Column(name="txNomeParlamentar")
//	private String txNomeParlamentar;
	
	@Column(name="nuCarteiraParlamentar")
	private int nuCarteiraParlamentar;
	
	@Column(name="nuLegislatura")
	private int nuLegislatura;
	
	@Column(name="sgUF")
	private String sgUF;
	
	@Column(name="sgPartido")
	private String sgPartido;
	
	@Column(name="codLegislatura")
	private int codLegislatura;
	
	@Column(name="numSubCota")
	private int numSubCota;
	
//	@Column(name="txtDescricao")
//	private String txtDescricao;
	
	@Column(name="numEspecificacaoSubCota")
	private int numEspecificacaoSubCota;
	
//	@Column(name="txtDescricaoEspecificacao")
//	private String txtDescricaoEspecificacao;
	
//	@Column(name="txtBeneficiario")
//	private String txtBeneficiario;
	
	@Column(name="")
	private String txtCNPJCPF;
	
	@Column(name="txtNumero")
	private String txtNumero;
	
	@Column(name="indTipoDocumento")
	private int indTipoDocumento;
	
//	@Column(name="datEmissao")
//	private Date datEmissao;
	
	@Column(name="vlrDocumento")
	private double vlrDocumento;
	
	@Column(name="vlrGlosa")
	private double vlrGlosa;
	
	@Column(name="vlrLiquido")
	private double vlrLiquido;
	
	@Column(name="numMes")
	private int numMes;
	
	@Column(name="numAno")
	private int numAno;
	
	@Column(name="")
	private int numParcela;
	
	@Column(name="numLote")
	private int numLote;
	
	@Column(name="numRessarcimento")
	private int numRessarcimento;
	
//	@Column(name="txtPassageiro")
//	private
//	String txtPassageiro;
	
//	@Column(name="txtTrecho")
//	private
//	String txtTrecho;
	
	
//	public String getTxNomeParlamentar() {
//		return txNomeParlamentar;
//	}
//	public void setTxNomeParlamentar(String txNomeParlamentar) {
//		this.txNomeParlamentar = txNomeParlamentar;
//	}
	public int getNuCarteiraParlamentar() {
		return nuCarteiraParlamentar;
	}
	public void setNuCarteiraParlamentar(int nuCarteiraParlamentar) {
		this.nuCarteiraParlamentar = nuCarteiraParlamentar;
	}
	public int getNuLegislatura() {
		return nuLegislatura;
	}
	public void setNuLegislatura(int nuLegislatura) {
		this.nuLegislatura = nuLegislatura;
	}
	public String getSgUF() {
		return sgUF;
	}
	public void setSgUF(String sgUF) {
		this.sgUF = sgUF;
	}
	public String getSgPartido() {
		return sgPartido;
	}
	public void setSgPartido(String sgPartido) {
		this.sgPartido = sgPartido;
	}
	public int getCodLegislatura() {
		return codLegislatura;
	}
	public void setCodLegislatura(int codLegislatura) {
		this.codLegislatura = codLegislatura;
	}
	public int getNumSubCota() {
		return numSubCota;
	}
	public void setNumSubCota(int numSubCota) {
		this.numSubCota = numSubCota;
	}
//	public String getTxtDescricao() {
//		return txtDescricao;
//	}
//	public void setTxtDescricao(String txtDescricao) {
//		this.txtDescricao = txtDescricao;
//	}
	public int getNumEspecificacaoSubCota() {
		return numEspecificacaoSubCota;
	}
	public void setNumEspecificacaoSubCota(int numEspecificacaoSubCota) {
		this.numEspecificacaoSubCota = numEspecificacaoSubCota;
	}
//	public String getTxtDescricaoEspecificacao() {
//		return txtDescricaoEspecificacao;
//	}
//	public void setTxtDescricaoEspecificacao(String txtDescricaoEspecificacao) {
//		this.txtDescricaoEspecificacao = txtDescricaoEspecificacao;
//	}
//	public String getTxtBeneficiario() {
//		return txtBeneficiario;
//	}
//	public void setTxtBeneficiario(String txtBeneficiario) {
//		this.txtBeneficiario = txtBeneficiario;
//	}
	public String getTxtCNPJCPF() {
		return txtCNPJCPF;
	}
	public void setTxtCNPJCPF(String txtCNPJCPF) {
		this.txtCNPJCPF = txtCNPJCPF;
	}
	public String getTxtNumero() {
		return txtNumero;
	}
	public void setTxtNumero(String txtNumero) {
		this.txtNumero = txtNumero;
	}
	public int getIndTipoDocumento() {
		return indTipoDocumento;
	}
	public void setIndTipoDocumento(int indTipoDocumento) {
		this.indTipoDocumento = indTipoDocumento;
	}
//	public Date getDatEmissao() {
//		return datEmissao;
//	}
//	public void setDatEmissao(Date datEmissao) {
//		this.datEmissao = datEmissao;
//	}
	public double getVlrDocumento() {
		return vlrDocumento;
	}
	public void setVlrDocumento(double vlrDocumento) {
		this.vlrDocumento = vlrDocumento;
	}
	public double getVlrGlosa() {
		return vlrGlosa;
	}
	public void setVlrGlosa(double vlrGlosa) {
		this.vlrGlosa = vlrGlosa;
	}
	public double getVlrLiquido() {
		return vlrLiquido;
	}
	public void setVlrLiquido(double vlrLiquido) {
		this.vlrLiquido = vlrLiquido;
	}
	public int getNumMes() {
		return numMes;
	}
	public void setNumMes(int numMes) {
		this.numMes = numMes;
	}
	public int getNumAno() {
		return numAno;
	}
	public void setNumAno(int numAno) {
		this.numAno = numAno;
	}
	public int getNumParcela() {
		return numParcela;
	}
	public void setNumParcela(int numParcela) {
		this.numParcela = numParcela;
	}
	public int getNumLote() {
		return numLote;
	}
	public void setNumLote(int numLote) {
		this.numLote = numLote;
	}
	public int getNumRessarcimento() {
		return numRessarcimento;
	}
	public void setNumRessarcimento(int numRessarcimento) {
		this.numRessarcimento = numRessarcimento;
	}
//	public String getTxtPassageiro() {
//		return txtPassageiro;
//	}
//	public void setTxtPassageiro(String txtPassageiro) {
//		this.txtPassageiro = txtPassageiro;
//	}
//	public String getTxtTrecho() {
//		return txtTrecho;
//	}
//	public void setTxtTrecho(String txtTrecho) {
//		this.txtTrecho = txtTrecho;
//	}
}
