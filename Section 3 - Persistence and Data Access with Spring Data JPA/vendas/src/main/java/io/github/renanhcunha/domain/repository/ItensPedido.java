package io.github.renanhcunha.domain.repository;

import io.github.renanhcunha.domain.entity.ItemPedido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItensPedido extends JpaRepository<ItemPedido, Integer> {
}
