package hetman.springframework.sfgpetclinic.services.springdatajpa;

import hetman.springframework.sfgpetclinic.model.Visit;
import hetman.springframework.sfgpetclinic.repositories.VisitRepository;
import hetman.springframework.sfgpetclinic.services.VisitService;

import java.util.HashSet;
import java.util.Set;

public class VisitSDJpaVisitService implements VisitService {
    private final VisitRepository visitRepository;

    public VisitSDJpaVisitService(VisitRepository visitRepository) {
        this.visitRepository = visitRepository;
    }

    @Override
    public Set<Visit> findAll() {
        Set<Visit> visits = new HashSet<>();
        visitRepository.findAll().forEach(visits::add);
        return visits;
    }

    @Override
    public Visit findById(Long aLong) {
        return visitRepository.findById(aLong).orElse(null);
    }

    @Override
    public Visit save(Visit object) {
        return visitRepository.save(object);
    }

    @Override
    public void delete(Visit object) {
        visitRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        visitRepository.deleteById(aLong);
    }
}
