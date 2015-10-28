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
@Table(name = "PHD_STUDENT")
public class PhDStudent extends Student implements Serializable {

	private static final long serialVersionUID = -8586640914786431616L;
	
	@Column(name = "PHD_DEFENSE")
	@Enumerated(EnumType.STRING)
	protected EvaluationEnum phd_defense;
	
	@Column(name = "TEACHING_INTERNSHIP")
	@Enumerated(EnumType.STRING)
	protected TeachingInternship teaching_internship;
	
	@Override
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
		if(article_publications.size() == 2){
			this.article_publications = article_publications;
		}
	}

	public EvaluationEnum getPhd_defense() {
		return phd_defense;
	}

	public void setPhd_defense(EvaluationEnum phd_defense) {
		this.phd_defense = phd_defense;
	}
    
}
