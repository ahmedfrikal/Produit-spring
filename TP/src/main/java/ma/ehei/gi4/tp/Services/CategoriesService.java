package ma.ehei.gi4.tp.Services;

import ma.ehei.gi4.tp.Entities.Category;
import ma.ehei.gi4.tp.Repository.CategorieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class CategoriesService {

    @Autowired
    private CategorieRepository categorieRepository;
    public List<Category> getCategories(){
        return categorieRepository.findAll();
    }

    public  Category getCategorie(Long id){
       return categorieRepository.findById(id).get();
    }

    public Category save(Category category){
        return categorieRepository.save(category);
    }
    public Category update(Long id,Category category){
        category.setId(id);
        return categorieRepository.save(category);
    }

    public void delete(Long id){
        categorieRepository.deleteById(id);
    }


}
