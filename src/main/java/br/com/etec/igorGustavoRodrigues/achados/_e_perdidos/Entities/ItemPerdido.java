package br.com.etec.igorGustavoRodrigues.achados._e_perdidos.Entities;

import br.com.etec.igorGustavoRodrigues.achados._e_perdidos.Enums.StatusItemEnum;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@Table(name = "ItemPerdido")

public class ItemPerdido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long idItem;

    @Column(name = "nomeItem")
    private String nomeItem;

    @Column(name = "localEncontrado")
    private String localEncontrado;

    @Column(name = "dataAchado")
    private LocalDateTime dataAchado;

    @Column(name = "statusItem")
    private StatusItemEnum statusItem;

    @Column(name = "descricaoDevolucao")
    private String descricao;

}
