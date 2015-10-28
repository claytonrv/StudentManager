package data;

import java.util.List;

import javax.faces.bean.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import model.MastersDegreeStudent;
import model.PhDStudent;

/**
 * @author Clayton Veras, Clayton Santos & Marcos Alexandre
 */
@ApplicationScoped
public class StudentsRepository {
    
    @Inject
    private EntityManager em;
    
    
    public PhDStudent findPhDStudentById(Long id) {
        return em.find(PhDStudent.class, id);
    }
    
    public PhDStudent findPhDStudentByName(String name) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<PhDStudent> criteria = cb.createQuery(PhDStudent.class);
        Root<PhDStudent> phdStudent = criteria.from(PhDStudent.class);
        criteria.select(phdStudent).where(cb.equal(phdStudent.get("name"), name));
        return em.createQuery(criteria).getSingleResult();
    }
    
    public List<PhDStudent> findAllPhDStudentOrderedByName() {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<PhDStudent> criteria = cb.createQuery(PhDStudent.class);
        Root<PhDStudent> phdStudent = criteria.from(PhDStudent.class);
        criteria.select(phdStudent).orderBy(cb.asc(phdStudent.get("name")));
        return em.createQuery(criteria).getResultList();
    }
    
    public MastersDegreeStudent findMasterDegreeStudentById(Long id) {
        return em.find(MastersDegreeStudent.class, id);
    }
    
    public MastersDegreeStudent findMasterDegreestudentByName(String name) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<MastersDegreeStudent> criteria = cb.createQuery(MastersDegreeStudent.class);
        Root<MastersDegreeStudent> mastersDegreeStudent = criteria.from(MastersDegreeStudent.class);
        criteria.select(mastersDegreeStudent).where(cb.equal(mastersDegreeStudent.get("name"), name));
        return em.createQuery(criteria).getSingleResult();
    }
    
    public List<MastersDegreeStudent> findAllMasterDegreestudentOrderedByName() {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<MastersDegreeStudent> criteria = cb.createQuery(MastersDegreeStudent.class);
        Root<MastersDegreeStudent> mastersDegreeStudent = criteria.from(MastersDegreeStudent.class);
        criteria.select(mastersDegreeStudent).orderBy(cb.asc(mastersDegreeStudent.get("name")));
        return em.createQuery(criteria).getResultList();
    }
}
