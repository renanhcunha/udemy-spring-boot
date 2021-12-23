package io.github.renanhcunha.domain.repository;

import io.github.renanhcunha.domain.entity.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Produtos extends JpaRepository<Produto, Integer> {
}
