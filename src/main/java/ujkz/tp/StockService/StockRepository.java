package ujkz.tp.StockService;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface StockRepository extends JpaRepository<Stock, Integer> {

    @Query("SELECT sum(quantite) FROM Stock WHERE produitId = :produitId")
    public int getQuantitTotalByProduit(@Param("produitId") int produitId);

}