package ma.ehei.gi4.tp.Controllers;

import ma.ehei.gi4.tp.Entities.Produit;
import ma.ehei.gi4.tp.Services.ProduitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class ProduitControllers {

    @Autowired
    private ProduitService produitService;

    @GetMapping("/Produits")
    public List<Produit> produitList(){
        return produitService.getProduits();
    }
    @GetMapping("/Produits/{id}")
    public Produit getProduit(@PathVariable("id") Long id ){
        return produitService.getProduit(id);
    }

    @PostMapping("/Produits/{idCategories}")
    public Produit save(@PathVariable("idCategories") Long idCategories,  @RequestBody Produit produit){
        return produitService.save(idCategories,produit);
    }
    @PutMapping("/Produit/{id}")
    public Produit update(@PathVariable("id") Long id,@RequestBody Produit produit){
        return produitService.update(id, produit);
    }
    @DeleteMapping("/Produit/{id}")
    public void delete(@PathVariable("id") Long id){produitService.delete(id);}

}
