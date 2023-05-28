package ma.ehei.gi4.tp.Controllers;


import ma.ehei.gi4.tp.Entities.Category;
import ma.ehei.gi4.tp.Services.CategoriesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CategoriesControllers {

    @Autowired
    private CategoriesService categoriesService;

    @GetMapping(path = "/categories")

    public List<Category> categoryList(){
       return categoriesService.getCategories();
    }

    @GetMapping( value = "/categories/{id}")
    public Category getCategory(@PathVariable("id") Long id ){
        return categoriesService.getCategorie(id);
    }


    @PostMapping(path = "/categories")
    public  Category save( @RequestBody Category category){
        return categoriesService.save(category);
    }

    @PutMapping("/categories/{id}")
    public Category update(@PathVariable Long id, @RequestBody Category category){
        return categoriesService.update(id, category);
    }
    @DeleteMapping("/categories/{id}")
    public void delete(@PathVariable Long id){
        categoriesService.delete(id);
    }

}
