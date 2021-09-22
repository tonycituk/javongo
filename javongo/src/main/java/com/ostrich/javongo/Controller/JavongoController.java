package com.ostrich.javongo.Controller;

import java.util.List;

import com.ostrich.javongo.Entities.Javongo;
import com.ostrich.javongo.Service.JavongoService;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JavongoController {
    private final JavongoService javongoService;

    public JavongoController(JavongoService javongoService) {
        this.javongoService = javongoService;
    }

    @GetMapping("/javongos")
    public List<Javongo> findAllJavongos() {
        return this.javongoService.findAllJavongos();
    }

    @GetMapping("/javongo/{id}")
    public Javongo findJavongo(@PathVariable String id) {
        return this.javongoService.findJavongo(id);
    }

    @PostMapping("/javongo")
    public void addJavongo(@RequestBody Javongo newJavongo) {
        this.javongoService.addJavongo(newJavongo);
    }

    @PutMapping("/javongo/{id}")
    public void updateJavongo(@RequestBody Javongo updatedJavongo, @PathVariable String id) {
        this.javongoService.updateJavongo(updatedJavongo, id);
    }

    @DeleteMapping("/javongo/{id}")
    public void deleteJavongo(@PathVariable String id) {
        this.javongoService.deleteJavongo(id);
    }
}
