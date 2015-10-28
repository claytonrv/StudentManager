package model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;

import util.EvaluationEnum;

/**
 * @author Clayton Veras, Clayton Santos & Marcos Alexandre
 */
@Entity
@Table(name = "MASTERS_DEGREE_STUDENT")
public class MastersDegreeStudent extends Student implements Serializable {

	private static final long serialVersionUID = 2546776107093462583L;

	@Column(name = "MASTERS_DEGREE_DEFENSE")
	@Enumerated(EnumType.STRING)
	protected EvaluationEnum masters_degree_defense;
	
	public Long getId(){
        return this.id;
    }

	// TODO Criar lógica para calcular o tempo restante de curso de acordo com a data inicial
	/****/
	@Override
	public int getDeadlineConclusion() {
		return 0;
	}
	
    @Override
    public void setDeadlineConclusion(int deadlineConclusion) {
       
    }
    /****/
    
	@Override
	public void setArticle_publications(List<Article> article_publications) {
		if(article_publications.size() == 1){
			this.article_publications = article_publications;
		}
		
	}

	public EvaluationEnum getMasters_degree_defense() {
		return masters_degree_defense;
	}

	public void setMasters_degree_defense(EvaluationEnum masters_degree_defense) {
		this.masters_degree_defense = masters_degree_defense;
	}
}
