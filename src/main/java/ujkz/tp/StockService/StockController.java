package ujkz.tp.StockService;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class StockController {

    private final StockRepository repository;

    // constructeur
    public StockController(StockRepository repository) {
        this.repository = repository;
    }

    @PostMapping("/stock")
    public int createStock(@RequestBody Stock stock) {
        Stock stockSaved = this.repository.save(stock);
        return stockSaved.getId();
    }


    @GetMapping("/stock/{idProduit}")
    public int getStockOfProduit(@PathVariable int idProduit) {
        try{
            int quantite = this.repository.getQuantitTotalByProduit(idProduit);
            return quantite;
        } catch (Exception e) {
            return 0;
        }
    }


    @GetMapping("/stock")
    public ArrayList<Stock> getStocks() {
        return (ArrayList<Stock>) this.repository.findAll();
    }
}
