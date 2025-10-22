package in.raj.repository;

import in.raj.entity.Employ;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * EmployRepo Interface
 * ---------------------
 * यह Spring Data JPA Repository interface है जो Employ entity के लिए
 * सभी CRUD (Create, Read, Update, Delete) operations प्रदान करता है।
 *
 * यह JpaRepository<Employ, Long> को extend कर रहा है:
 *  - Employ  → Entity class का नाम
 *  - Long → Employ entity की primary key का data type
 *
 * JpaRepository पहले से ही निम्न built-in methods provide करता है:
 *   ✅ save(entity)
 *   ✅ findById(id)
 *   ✅ findAll()
 *   ✅ deleteById(id)
 *   ✅ count()
 *   ✅ existsById(id)
 * आदि।
 *
 * इसलिए आपको basic CRUD के लिए कोई extra method लिखने की जरूरत नहीं।
 */
public interface EmployRepo extends JpaRepository<Employ, Long> {
    // Custom query methods (if needed) यहां define कर सकते हैं
}
