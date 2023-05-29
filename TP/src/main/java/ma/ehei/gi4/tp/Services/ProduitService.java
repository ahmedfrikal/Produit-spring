package ma.ehei.gi4.tp.Services;

import ma.ehei.gi4.tp.Entities.Category;
import ma.ehei.gi4.tp.Entities.Produit;
import ma.ehei.gi4.tp.Repository.CategorieRepository;
import ma.ehei.gi4.tp.Repository.ProduitRepository;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ProduitService {

    private ProduitRepository produitRepository;
    private CategorieRepository categorieRepository;

    public ProduitService(ProduitRepository produitRepository, CategorieRepository categorieRepository) {
        this.produitRepository = produitRepository;
        this.categorieRepository = categorieRepository;
    }

    public List<Produit> getProduits(){
        return produitRepository.findAll();
    }

    public  Produit getProduit(Long id){
        return produitRepository.findById(id).get();
    }


    public Produit save(Long categoryId, Produit produit){
        boolean verifierCategorie=categorieRepository.existsById(categoryId);
        if(verifierCategorie)
        {
            Category category=categorieRepository.findById(categoryId).get();
            produit.setCategory(category);
            return produitRepository.save(produit);
        }
        else{
            return null;
        }

    }
    public Produit update(Long id,Produit Produit){
        Produit.setId(id);
        return produitRepository.save(Produit);
    }

    public void delete(Long id){
        produitRepository.deleteById(id);
    }
}
