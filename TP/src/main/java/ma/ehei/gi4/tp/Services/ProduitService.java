package ma.ehei.gi4.tp.Services;

import ma.ehei.gi4.tp.Entities.Produit;
import ma.ehei.gi4.tp.Repository.ProduitRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ProduitService {

    @Autowired
    private ProduitRepository produitRepository;
    public List<Produit> getCategories(){
        return produitRepository.findAll();
    }

    public  Produit getCategorie(Long id){
        return produitRepository.findById(id).get();
    }



    public Produit save(Produit Produit){
        return produitRepository.save(Produit);
    }
    public Produit update(Long id,Produit Produit){
        Produit.setId(id);
        return produitRepository.save(Produit);
    }

    public void delete(Long id){
        produitRepository.deleteById(id);
    }
}
