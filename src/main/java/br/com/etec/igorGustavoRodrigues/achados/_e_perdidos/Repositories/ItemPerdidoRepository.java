package br.com.etec.igorGustavoRodrigues.achados._e_perdidos.Repositories;


import br.com.etec.igorGustavoRodrigues.achados._e_perdidos.Entities.ItemPerdido;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDateTime;
import java.util.List;

public interface ItemPerdidoRepository extends JpaRepository<ItemPerdido, Long> {
    List<ItemPerdido> findByidItem(Long idItem);
}
