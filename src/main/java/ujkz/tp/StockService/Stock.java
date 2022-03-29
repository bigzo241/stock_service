package ujkz.tp.StockService;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Stock {

    @Id
    private final int id;

    @Column(name = "produitId", nullable = false)
    private final int produitId;

    @Column(name = "quantite", nullable = false)
    private final int quantite;


    public Stock() {
        this.id = -1;
        this.produitId = -1;
        this.quantite = 0;
    }

    public Stock(int id, int produitId, int quantite) {
        this.id = id;
        this.produitId = produitId;
        this.quantite = quantite;
    }

    public int getId() {
        return this.id;
    }

    public int getProduitId() {
        return this.produitId;
    }

    public int getQuantite() {
        return this.quantite;
    }
}
