package com.ostrich.javongo.Service;

import java.util.List;

import com.ostrich.javongo.Entities.Javongo;
import com.ostrich.javongo.Repository.JavongoRepository;

import org.springframework.stereotype.Service;

@Service
public class JavongoService {

    private final JavongoRepository javongoRepository;

    public JavongoService(JavongoRepository javongoRepository) {
        this.javongoRepository = javongoRepository;
    }

    public List<Javongo> findAllJavongos(){
        return this.javongoRepository.findAll();
    }
    
    public Javongo findJavongo(String id){
        return this.javongoRepository.findById(id).orElse(null);
    }

    public void addJavongo(Javongo newJavongo){
        this.javongoRepository.save(newJavongo);
    }

    public void updateJavongo(Javongo updatedJavongo, String id){
        Javongo javongo = findJavongo(id);
        javongo.setMessage(updatedJavongo.getMessage());
        this.javongoRepository.save(javongo);
    }

    public void deleteJavongo(String id){
        this.javongoRepository.deleteById(id);
    }
}
